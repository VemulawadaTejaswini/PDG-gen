import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int K = sc.nextInt();
        String Ss = sc.next();
        char[] S = Ss.toCharArray();
        char now = S[0];
        int turn = 0;
        int point=0;
        for(int i=0;i<N;i++){
            if(S[i] != now){
                now = S[i];
                turn ++;
            }
            if(S[i] == 'R' && i+1 < N && S[i+1] == 'R'){
                point ++;
            }
            if(i > 0 && S[i] == 'L' && S[i-1] == 'L'){
                point ++;
            }
        }
        point += Math.min(K*2, turn);
        System.out.println(point);
    }
}
