import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String s=sc.next();
       String y[]=s.split("/");
        System.out.printf("2018/01/%s",y[2]);
    }
}