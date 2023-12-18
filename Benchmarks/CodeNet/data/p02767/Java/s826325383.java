import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int[] x = new int[n];
        for(int i=0; i<n; i++){
            x[i] = stdIn.nextInt();
        }

        long minEnergy = Long.MAX_VALUE;
        for(int pos=1; pos<=100; pos++){
            long energy = 0;
            for(int i=0; i<n; i++){
                energy += Math.pow((x[i] - pos), 2);
            }
            if(energy < minEnergy){
                minEnergy = energy;
            }
        }

        System.out.println(minEnergy);
    }
}