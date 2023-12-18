import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Double[][] soln = new Double[n][Math.max(1, (n - 1) / 2 + 1)];
        for(int i=0;i<n;i++){
            for(int j=0; j<(n - 1) / 2 + 1; j++){
                soln[i][j]=0D;
            }
        }
        Double[] coins = new Double[n];
        Double prod = 1D;
        for(int i=0;i<n;i++){
            coins[i]=Double.parseDouble(st.nextToken());
            prod*=coins[i];
        }

        if(n==1){
            System.out.println(coins[0]);
            return;
        }

        soln[0][0]=coins[0];
        soln[0][1]=1-coins[0];
        soln[n-1][0]=prod;


        for(int i=1;i<n;i++){
            soln[i][0]=soln[i-1][0]*coins[i];
            for(int j=1;j<=Math.min(i+1,(n-1)/2); j++){
                soln[i][j]=soln[i-1][j]*coins[i] + soln[i-1][j-1]*(1-coins[i]);
            }
        }
        double sum=0;
        for(int i=0;i<=(n-1)/2;i++){
            sum+=soln[n-1][i];
        }
        System.out.println(sum);

    }


}
