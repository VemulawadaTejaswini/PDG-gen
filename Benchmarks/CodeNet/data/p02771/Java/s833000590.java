import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int judge = a-b-c;
        boolean judge2 = a==b && b==c;
        if((judge == a*(-1) || judge == b*(-1) || judge == c*(-1))^judge2)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}