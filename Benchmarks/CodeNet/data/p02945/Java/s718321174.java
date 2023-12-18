import java.util.Scanner;

public class one {
    int maxCount(int a,int b){
        return Math.min(a+b,Math.min(a-b,a*b));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        one o=new one();
        System.out.println(o.maxCount(a,b));
    }
}