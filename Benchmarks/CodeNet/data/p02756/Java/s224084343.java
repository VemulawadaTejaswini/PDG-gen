import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int Q = sc.nextInt();

        for(int i=1; i<=Q; i++){
            String Sn = "";
            int T = sc.nextInt();
            if(T==1){
                int l = S.length();
                for(int j=l-1; j>=0; j--){
                        Sn += S.substring(j, j + 1);
                }
                S = Sn;
            }
            else if(T==2){
                int F = sc.nextInt();
                String C = sc.next();
                if(F==1){
                    Sn = C + S;
                    S = Sn;
                }
                else if(F==2){
                    Sn = S + C;
                    S = Sn;
                }
            }
        }
        System.out.println(S);
    }
}