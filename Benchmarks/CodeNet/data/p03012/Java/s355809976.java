import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int[] w = new int[n];
        for(int i=0; i<n; i++){
            w[i] = stdIn.nextInt();
        }

        int s = 0;
        int sSum = w[0];
        int g = n-1;
        int gSum = w[n-1];

        while(s+1 != g){
            if(sSum <= gSum){
                s++;
                sSum += w[s];
            }else{
                g--;
                gSum += w[g];
            }
        }

        System.out.println(Math.abs(sSum-gSum));
    }
}