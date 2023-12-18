import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int l = S.length();
        String T = "RLUD";

        for(int i=0; i<l/2; i++){
            if((S.charAt(2*i)!=T.charAt(0) && S.charAt(2*i)!=T.charAt(2) && S.charAt(2*i)!=T.charAt(3)) || (S.charAt(2*i+1)!=T.charAt(1) && S.charAt(2*i+1)!=T.charAt(2) && S.charAt(2*i+1)!=T.charAt(3))){
                System.out.println("No");
                break;
            }
        if(i==l/2-1){
            System.out.println("Yes");
        }
        }
    }
}