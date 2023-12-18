import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A=sc.nextInt();
        int B=sc.nextInt();

        int max=0;
        int min=0;

        if(A>B) max=B;
        else if(A<B) max=A;
        else max=A;

        if(A+B>N){
            if(A>B) min=A-B;
            else if(A<B) min=B-A;
            else min=A;
        }else min=0;

        System.out.println(max+" "+min);

    }
}