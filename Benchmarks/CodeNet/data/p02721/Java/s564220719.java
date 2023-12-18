import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int C = sc.nextInt();
        char[] S = sc.next().toCharArray();
        int[] lf = new int[N];
        int[] rf = new int[N];
        int nowDay = 0;
        Arrays.fill(lf, -1);
        Arrays.fill(rf, -1);
        for(int i=0;i<N;i++){
            if(S[i] == 'o'){
                lf[i] = nowDay;
                i = i+C;
                nowDay++;
            }
        }
        nowDay = K-1;
        for(int i=N-1;i>=0;i--){
            if(S[i] == 'o'){
                rf[i] = nowDay;
                i = i-C;
                nowDay --;
            }
        }
        for(int i=0;i<N;i++){
            if(lf[i] != -1 && lf[i] == rf[i] && S[i] == 'o'){
                System.out.println(i+1);
            }
        }
    }

    private static void showArr(int[] a){
        for(int p:a){
            System.out.print(p);
        }
        System.out.println();
    }

}
