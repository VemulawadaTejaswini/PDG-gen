import java.util.Scanner;
import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;
// import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] state = {0, 1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> mem = new ArrayList<>();

        while (true) {
            try {
                String[] line = sc.nextLine().split(" ");
                if (line.length != 8) {
                    break;
                }
                for (int i=0; i<8; ++i) {
                    state[i] = Integer.parseInt(line[i]);
                }
                mem.add(encode(state));
            } catch (Exception e) {
                break;
            }
        }
        // Random random = new Random();
        // for (int var=0; var<1000; ++var) {
        //     for (int i=0; i<100; ++i) {
        //         state = move(state, random.nextInt(4));
        //     }
        //     mem.add(encode(state));
        // }
        bfs(mem);
        sc.close();
    }

    private static void bfs(ArrayList<Integer> state) {
        int[] goal = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] new_pat = new int[8];
        ArrayList<Integer> mm = new ArrayList<>();
        ArrayList<Integer> counter = new ArrayList<>();
        Queue<StateNode> queue = new ArrayDeque<>();
        StateNode initnode = new StateNode(0, goal, 0);
        queue.add(initnode);
        StateNode node = null;
        mm.add(encode(goal));
        counter.add(0);

        while (queue.size() > 0) {
            node = queue.poll();

            ArrayList<Integer> mList = next_move_list(node.pat, node.move);

            for (int i=0; i<mList.size(); ++i) {
                for (int j=0; j<new_pat.length; ++j) {
                    new_pat[j] = node.pat[j];
                }
                new_pat = move(new_pat, mList.get(i));
                int enc = encode(new_pat);
                if (mm.contains(enc)) {
                    continue;
                }
                StateNode newnode = new StateNode(mList.get(i), new_pat, node.parent + 1);
                mm.add(enc);
                counter.add(newnode.parent);
                queue.add(newnode);
            }
        }

        // System.out.println(mm.size());

        for (int i=0; i<state.size(); ++i) {
            System.out.println(counter.get(mm.indexOf(state.get(i))));
        }
    }

    private static int encode(int[] st) {
        int s = 0;
        for (int i=0; i<st.length; ++i) {
            s = s * 8 + st[i];
        }
        return s;
    }

    private static int[] move(int[] pat, int i) {
        int z = find_zero(pat);
        int ix = z % 4;
        int iy = Math.floorDiv(z, 4);
        if (i == 1 && iy > 0){
            pat[z] = pat[z - 4];
            pat[z - 4] = 0;
        } else if (i == 0 && iy < 1){
            pat[z] = pat[z + 4];
            pat[z + 4] = 0;
        } else if (i == 2 && ix > 0){
            pat[z] = pat[z - 1];
            pat[z - 1] = 0;
        } else if (i == 3 && ix < 3){
            pat[z] = pat[z + 1];
            pat[z + 1] = 0;
        }
        return pat;
    }

    private static ArrayList<Integer> next_move_list(int[] pat, int last_move) {
        ArrayList<Integer> moves = new ArrayList<>();
        int z = find_zero(pat);
        int ix = z % 4;
        int iy = Math.floorDiv(z, 4);

        if (iy > 0 && last_move != 0) moves.add(1);
        if (iy < 1 && last_move != 1) moves.add(0);
        if (ix > 0 && last_move != 3) moves.add(2);
        if (ix < 3 && last_move != 2) moves.add(3);
        return moves;
    }

    private static int find_zero(int[] pat) {
        for (int i=0; i<pat.length; ++i) {
            if (pat[i] == 0) {
                return i;
            }
        }
        return 100;
    }

    private static class StateNode{
        private int move = -1;
        private int[] pat = new int[8];
        private int parent = 0;

        private StateNode(int move, int[] pat, int parent) {
            this.move = move;
            this.parent = parent;
            for (int i=0; i<pat.length; ++i) {
                this.pat[i] = pat[i];
            }
        }
    }
}

