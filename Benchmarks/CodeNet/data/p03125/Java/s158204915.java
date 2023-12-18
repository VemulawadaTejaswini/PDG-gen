import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans1 = a+b;
        int ans2 = b-a;

        System.out.println(b%a == 0 ? a+b:b-a);
    }
}