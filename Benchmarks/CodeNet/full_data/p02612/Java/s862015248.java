import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        while (tan.hasNext()){
            int n,a=0;
            n=tan.nextInt();
            a=n%1000;
            if (a==0)
                a=1000;
            System.out.println(1000-a);
        }
    }
}
