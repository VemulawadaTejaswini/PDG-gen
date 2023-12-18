import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A,B,C,num;
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        if(A%2==0&&B%2==0&&C%2==1)System.out.println("NO");
        else if(A%2==1&&B%2==0&&C%2==0)System.out.println("NO");
        else System.out.println("YES");
    }
}