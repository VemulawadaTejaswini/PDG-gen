import java.io.*;
import java.util.*;

public class Main{

        public static void main(String[] args) throws Exception{

            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;

            InputReader in = new InputReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);

            Task solver = new Task();
            solver.solve(in,out);
            out.close();
        }

        static class Task{

            public void solve(InputReader in, PrintWriter out){

                int n = in.nextInt();

                int[][] happiness = new int[n][3];
                long[][] result = new long[n][3];

                for(int i = 0;i<n;i++){
                    for(int j = 0;j<3;j++)
                        happiness[i][j] = in.nextInt();
                }

                out.println(go(happiness, result));
            }

            public long go(int[][] happiness, long[][] result){
                return Math.max(goIter(happiness,result, 0, 0), Math.max(goIter(happiness,result,0,1), goIter(happiness,result,0,2)));
            }

            // public long goRec(int[][] happiness,int row, int col){

            //     if(row < happiness.length){
            //         return (happiness[row][col] + Math.max(goRec(happiness, row+1, (col+1)%3), goRec(happiness, row+1, (col+2)%3)));
            //     }
            //     return 0;
            // }

            public long goIter(int[][] happiness, long[][] result, int row, int col){

                if(row > happiness.length-1)
                    return 0;

                if(result[row][col] != 0)
                    return result[row][col];

                if(row < happiness.length)
                    result[row][col] = happiness[row][col] + Math.max(goIter(happiness,result, row+1, (col+1)%3), goIter(happiness,result, row+1, (col+2)%3));

                return result[row][col];
            }
        }

        static class InputReader{

            BufferedReader reader;
            StringTokenizer tokenizer;

            public InputReader(InputStream inputStream){

                reader = new BufferedReader(new InputStreamReader(inputStream));
                tokenizer = null;

            }

            public String next(){
                while(tokenizer == null || !tokenizer.hasMoreTokens()){
                    try{
                        tokenizer = new StringTokenizer(reader.readLine());
                    }
                    catch(IOException e){
                        throw new RuntimeException(e);
                    }
                }

                return tokenizer.nextToken();
            }

            public int nextInt(){
                return Integer.parseInt(next());
            }
        }
}
