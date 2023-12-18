import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = 0;
        int X_MAX = 0;
        String S = "";
        S = sc.next();
        for(int i = 0; i < N ;i++){
            char moji = S.charAt(i);
            if(moji == 'I'){
                X++;
                if(X > X_MAX){
                    X_MAX = X;
                }
            }else{
                X--;
            }
        }
        System.out.println(X_MAX);
    }
}