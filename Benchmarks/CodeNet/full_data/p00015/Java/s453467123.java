import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            BigInteger a=sc.nextBigInteger();
            BigInteger b=sc.nextBigInteger();
            BigInteger ans=a.add(b);
            if(ans.toString().length()<=80){
                System.out.println(ans);
            }else{
                System.out.println("overflow");
            }
        }
        sc.close();
    }
}