import java.util.*;

public class Main{
    public static void main(String[] args){
      	final int A = 1000005;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      	int a[] = new int [n];
        int c[] = new int [A];
        int b;
        String ans = "pairwise coprime";
        for(int i = 0; i < A; i++){
            c[i] = 0;
        }
        for(int i = 0; i < n; i++){
            b = sc.nextInt();
            c[b] += 1;
        }

        for(int i = 2; i < A; i++){
            int cnt = 0;
            for(int j = i; j < A; j += i){
                cnt += c[j];
            }
            if(cnt == n){
                ans = "not coprime";
                break;
            }else if(cnt > 1){
                ans = "setwise coprime";
            }
        }
        System.out.println(ans);
    }
}
