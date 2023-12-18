import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int k=in.nextInt();
        if((a+b)>=k){
            System.out.println(a);
        }else{
            k=k-(a+b);
            System.out.println(a-k);
        }
    }
}