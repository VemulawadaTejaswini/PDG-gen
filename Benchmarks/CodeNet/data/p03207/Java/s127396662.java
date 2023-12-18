import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int maxpos = 0;
        int max = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            p[i] = sc.nextInt();
            sum += p[i];
            if(p[i] > max){
                max = p[i];
                maxpos = i;
            }
        }
        sc.close();

        sum -= p[maxpos] / 2;

        System.out.println(sum);
    }
}