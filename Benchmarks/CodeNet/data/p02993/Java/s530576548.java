import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int e = scan.nextInt();
        int a = e/1000;
        int b = e/100-a*10;
        int c = e/10-(a*100)-b*10;
        int d = e%10;
        if(a!=b&&a!=c&&a!=d&&b!=c&&b!=d&&c!=d){
            System.out.println("Good");
        }else{
            System.out.println("Bad");
        }
    }
}