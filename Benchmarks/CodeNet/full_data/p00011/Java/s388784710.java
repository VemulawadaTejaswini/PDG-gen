import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws Exception{

            int w = Integer.parseInt(reader.readLine());
            int n = Integer.parseInt(reader.readLine());

            int[] seq = new int[w];
            for (int i=0; i<w; i++)
                seq[i] = i+1;

            while (n-- > 0) {
                String[] s  = reader.readLine().split(",");
                int begin = Integer.parseInt(s[0]) - 1;
                int end = Integer.parseInt(s[1]) - 1;

                int tmp = seq[begin];
                seq[begin] = seq[end];
                seq[end] = tmp;
            }

            for (int i=0; i<w; i++)
                System.out.println(seq[i]);
        }

}