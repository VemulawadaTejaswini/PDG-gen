import java.util.*;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double value[] = new double[n];

        for (int i=0; i<n; i++) value[i] = sc.nextDouble();

        Arrays.sort(value);

        for (int i=0; i<n-1; i++){
            if (value[i]==0) continue;
            value[i+1] = (double)(value[i]+value[i+1])/2;
            Arrays.sort(value);
        }
        System.out.println(value[n-1]);

    }
}