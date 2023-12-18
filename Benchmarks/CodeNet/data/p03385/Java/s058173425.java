import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int num_a=0,num_b=0,num_c=0;
        String S;
        S = sc.next();
        for(int a=0;a<S.length();a++){
            if(S.charAt(a)=='a') num_a++;
            else if(S.charAt(a)=='b') num_b++;
            else num_c++;
        }
        if(num_a==1&&num_b==1&&num_c==1) System.out.println("Yes");
        else System.out.println("No");
    }
}
