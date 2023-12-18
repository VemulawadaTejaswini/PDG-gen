import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Sa =sc.next();
        String Sb =sc.next();
        String Sc =sc.next();
        
        String sptA[]=Sa.split("");
        String sptB[]=Sb.split("");
        String sptC[]=Sc.split("");
        
        String ansA=sptA[0].toUpperCase();
        String ansB=sptB[0].toUpperCase();
        String ansC=sptC[0].toUpperCase();
        
        System.out.println(ansA+ansB+ansC);
        
        
   }
}
