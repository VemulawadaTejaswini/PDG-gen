import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        String S = sc.next();
        int Q = sc.nextInt();
        int x = 0;
 
        for(int i=1; i<=Q; i++){
            int T = sc.nextInt();
            if(T==1){
                x += 1;
            }
            else if(T==2){
                int F = sc.nextInt();
                String C = sc.next();
                if((F==1 && x%2==0) || (F==2 && x%2!=0)){
                    S = C + S;
                }
                else if((F==2 && x%2==0) || (F==1 && x%2!=0)){
                    S = S + C;
                }
            }
        }
        if(x%2!=0){
            int l = S.length();
            String sn = "";
            for(int i=l-1; i>=0; i--){
                sn += String.valueOf((char)S.charAt(i));
            }
            S = sn;
        }
        System.out.println(S);
    }
}