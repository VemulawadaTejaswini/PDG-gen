import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Main {
    static class InputReader {
        BufferedReader br;
        StringTokenizer st;
        public InputReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try{
                str = br.readLine();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }
    static class Move{
        public Move(int i1, int j1){
            this.i1 = i1; this.j1 = j1;
        }
        public int i1, j1, i2, j2;
        public void print(){
            System.out.printf("%d %d %d %d%n", i1+1, j1+1, i2+1, j2+1);
        }
    }

    public static void main(String[] args){
        InputReader in = new InputReader();
        int H = in.nextInt(), W = in.nextInt();
        int[][] matrix = new int[H][W];
        for (int i = 0; i < H; ++i) {
            for (int j = 0; j < W; ++j) {
                matrix[i][j] = in.nextInt();
            }
        }
        solve(H, W, matrix);
    }
    public static void solve(int H, int W, int[][] matrix){
        ArrayList<Move> moves = new ArrayList<>();
        for (int i = 0; i < H; ++i){
            if ((i & 1) == 0) {
                for (int j = 0; j < W; ++j){
                    if ((matrix[i][j] & 1) == 0) continue;
                    Move move = new Move(i, j);
                    matrix[i][j]--;
                    if (j < W - 1){
                        matrix[i][j+1]++;
                        move.i2 = i; move.j2 = j+1;
                        moves.add(move);
                    }
                    else{
                        if (i == H - 1) continue;
                        matrix[i+1][j]++;
                        move.i2 = i+1; move.j2 = j;
                        moves.add(move);
                    }
                }
            }
            else{
                for (int j = W-1; j >= 0; --j){
                    if ((matrix[i][j] & 1) == 0) continue;
                    Move move = new Move(i, j);
                    matrix[i][j]--;
                    if (j > 0){
                        matrix[i][j-1]++;
                        move.i2 = i; move.j2 = j-1;
                        moves.add(move);
                    }
                    else{
                        if (i == H - 1) continue;
                        matrix[i+1][j]++;
                        move.i2 = i+1; move.j2 = j;
                        moves.add(move);
                    }
                }
            }
        }
        System.out.println(moves.size());
        for (Move move : moves){
            move.print();
        }
    }
}
