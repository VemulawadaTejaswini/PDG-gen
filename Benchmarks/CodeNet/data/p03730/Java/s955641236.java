import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A,B,C,num2=0;
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        for(int a=1;a<=B*A;a++){
            int num = a%B;
            if(num == C) num2 = 1;
        }
        if(num2!=0) System.out.println("YES");
        else System.out.println("NO");
    }
}