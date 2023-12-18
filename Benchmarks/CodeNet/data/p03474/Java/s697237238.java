import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int A=sc.nextInt();
        int B=sc.nextInt();
        String S=sc.next();
        
        String ans="Yes";
        
        for(int i=0;i<A;i++){
            if(S.substring(0,1).equals("-")){
                ans="No";
            }
            S=S.substring(1);
        }
        if(!S.substring(0,1).equals("-")){
                ans="No";
            }
            S=S.substring(1);
        for(int i=0;i<B;i++){
            if(S.substring(0,1).equals("-")){
                ans="No";
            }
            S=S.substring(1);
        }
        
        System.out.println(ans);
    }
}