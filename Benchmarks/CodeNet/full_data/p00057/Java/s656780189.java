import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws Exception{
        
            String row; 
            while ((row = reader.readLine()) != null) {
                int n = Integer.parseInt(row);
                System.out.println(rec(0, n)); 
            }

        }

        public static int rec(int sum, int n) {
            if (n == 1) {
                return sum + 2;
            }

            return rec(sum + n, n-1); 
        }

}