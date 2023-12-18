import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A,B,X,num;
        A=sc.nextInt();
        B=sc.nextInt();
        X=sc.nextInt();
        num=X-A;
        if(num<0) System.out.println("NO");
        else if(num>B) System.out.println("NO");
        else System.out.println("YES");

    }
}
