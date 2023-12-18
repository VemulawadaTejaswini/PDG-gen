import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String A=sc.next();
        String B=sc.next();
        String C=sc.next();

        int count=0;

        for(int i=0;i<N;i++){
            String a=String.valueOf(A.charAt(i));
            String b=String.valueOf(B.charAt(i));
            String c=String.valueOf(C.charAt(i));

            if(a.equals(b) && b.equals(c) && c.equals(a)) continue;
            else count+=1;

        }

        System.out.println(count);

    }
}