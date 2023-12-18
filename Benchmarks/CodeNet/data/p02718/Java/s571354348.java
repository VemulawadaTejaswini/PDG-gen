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
            int sum = 0;
            for(int i = 0; i < n; i++){
                sum += Integer.parseInt(votes[i]);
                voteInt[i] = Integer.parseInt(votes[i]);
            }

            int min = 0; 
            if(sum/(4*m)!= 0){
                min = sum/(4*m); 
            }
            else {
                min = Integer.MAX_VALUE; 
            }
           
            int canSelect = 0;

            Arrays.sort(voteInt);

            int [] reverse = new int[n];

            for(int i = n-1, j = 0; i >= 0; i--, j++){
                reverse[j] = voteInt[i];
            }

            for(int i =0; i < m; i++){
                if(reverse[i] >= min){
                    canSelect++;
                }
            }


            if(canSelect >= m){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }

