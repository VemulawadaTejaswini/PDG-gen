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
                int[] costs = new int[n];
                for(int i = 0;i<n;i++){
                    costs[i] = in.nextInt();
                }
                out.println(go(costs, 0));
            }

            public int go(int[] costs, int step){

                if(step >= costs.length)
                    return Integer.MAX_VALUE;

                if(step == costs.length-1)
                    return 0;

                int one_step_value = go(costs, step+1);
                if(step < costs.length - 1)
                    one_step_value += Math.abs(costs[step] - costs[step+1]);
                int two_steps_value = go(costs, step+2);
                if(step < costs.length - 2)
                    two_steps_value += Math.abs(costs[step] - costs[step+2]);

                return Math.min(one_step_value, two_steps_value);

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
