import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String S = sc.next();
        sc.close();

        int[] numB = new int[N]; //i番目までに黒が何個あるか
        for(int i = 0; i < N; i++){
            if(i == 0){
                if(S.charAt(i) == '#')
                    numB[i] = 1;
            } else {
                if(S.charAt(i) == '#')
                    numB[i] = numB[i-1]+1;
                else
                    numB[i] = numB[i-1];
            }
        }
        int n = numB[N-1];
        int min = numB[N-1]; //全部白に変える
        for(int i = 0; i < N-1; i++){
            if(i == 0 ){
                if(S.charAt(0) == '#'){
                    min = Math.min(min, N-n);
                }
            } else {
                if(numB[i] > numB[i-1]) {
                    int cnt = 0;
                    cnt += (numB[i]-1);
                    cnt += ((N-i) - (n-numB[i]));
                    min = Math.min(min, cnt);
                }
            }
        }
        System.out.println(min);

    }
}