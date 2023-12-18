    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Arrays;
    import java.util.stream.IntStream;

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
            int sum = Arrays.stream(voteInt).sum();

            int min = sum/(4*m);
            Arrays.sort(voteInt);

            int [] reverse = new int[n];

            for(int i = n-1, j = 0; i >= 0; i--, j++){
                reverse[j] = voteInt[i];
            }
            if(reverse[m-1] >= min){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }