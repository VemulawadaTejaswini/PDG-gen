import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        Long K = s.nextLong();
        
        ArrayList<Integer> graph = new ArrayList<Integer>();


        for (int i = 0; i < N; i++) {
            int v = Integer.parseInt(s.next());
            v--;
            graph.add(v);
        }

        System.out.println(graph);
        List<Integer> l = new ArrayList<Integer>();

        int state = 0;
        int sa;
        for (int i = 0; i < 10; i++) {
            if (l.contains(state)) {
                int fi = l.indexOf(state);
                int la = l.lastIndexOf(state);
                sa = la - fi;
                l.subList(fi, la);
                break;
            }
            l.add(state);
            state = graph.get(state);
        }


        int amari = (int) (K % 3);
        System.out.println(l.get(amari) + 1);

    }
}
