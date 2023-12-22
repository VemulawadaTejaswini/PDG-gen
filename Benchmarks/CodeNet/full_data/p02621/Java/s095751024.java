import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        while(tan.hasNext()){
            int a=tan.nextInt();
            System.out.println(a+a*a+a*a*a);
        }
    }
}
