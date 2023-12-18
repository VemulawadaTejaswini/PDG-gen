import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        sc.close();
        char[] c = S.toCharArray();
        int N = S.length();
        int idx = 0;
        int[] num = new int[N];
        while(idx < N){
            if(idx < N && c[idx] == 'R'){
                int cnt = 0;
                while(c[idx] == 'R'){
                    idx++;
                    cnt++;
                }
                num[idx] += (cnt)/2;
                num[idx-1] += (cnt+1)/2;
            }
            if(c[idx] == 'L'){
                int count = 0;
                int start = idx;
                while(idx < N &&c[idx] == 'L'){
                    idx++;
                    count++;
                }
                num[start] += (count+1)/2;
                num[start-1] += (count)/2;
            }
        }

        for(int i = 0; i < N; i++){
            System.out.print(num[i] + " ");
        }
   }
}