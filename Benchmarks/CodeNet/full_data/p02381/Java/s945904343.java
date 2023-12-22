import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        int S = 0;
        int n = 0;
        int[] Youso = new int[100] ;
        double m, b;
        double a = 0.0;
        for(i = 0; i < n; i++){
            n = sc.nextInt();
            if(n == 0) break;
            Youso[i] = sc.nextInt();
        }
        for(j = 0; j < n; j++){
            S += Youso[j];
        }
        m = S / n;
        for(k = 0; k < n; k++){
            a += Math.pow(Youso[k] - m, 2) / n;
        }
        b = Math.pow(a, 1 / 2);
        System.out.println(b);
    }
}
