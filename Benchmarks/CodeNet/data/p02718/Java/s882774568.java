    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Arrays;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String [] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);

            String [] votes = br.readLine().split(" ");
            int [] voteInt = new int[n];

            for(int i = 0; i < n; i++){
                voteInt[i] = Integer.parseInt(votes[i]);
            }
            long sum = Arrays.stream(voteInt).sum();

            int min = (int)sum/(4*m);
            int count = 0;

            for(int i = 0; i < n; i++){
                if(voteInt[i] >= min){
                    count++;
                }
            }

            if(count >= m){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }