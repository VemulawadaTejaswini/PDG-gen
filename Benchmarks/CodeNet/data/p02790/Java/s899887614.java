import java.util.*;

public class Main{
    public static void main(String[] args){
            int a, b, aLen, bLen,i;
            String A,B,sumA="",sumB="";
            Scanner scan = new Scanner(System.in);

            a = scan.nextInt();
            b = scan.nextInt();
            aLen = a;
            bLen = b;
            A = Integer.toString(a);
            B = Integer.toString(b);

            for(i=1;i<=bLen;i++){
                sumA += A;
            }

            for(i=1;i<=aLen;i++){
                sumB += B;
            }

            if(sumA.length() > sumB.length()){
                System.out.println(sumA);
            }
            if(sumA.length() < sumB.length()){
                System.out.println(sumB);
            }
            if(sumA.length() == sumB.length()){
                System.out.println(sumA);
            }


    }
}