import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] X =  new int[N];

        for(int i=0;i<N;i++){
            X[i] = sc.nextInt();
        }
        int ans = 1000000000;

        for(int j=1;j<101;j++){
            int total = 0;
            for(int i=0;i<N;i++){
                total += Math.pow(j-X[i],2);
            }
            ans = Math.min(ans,total);
        }

        System.out.println(ans);
    }

}






