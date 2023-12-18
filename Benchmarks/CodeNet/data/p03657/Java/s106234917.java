import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println(Math.min(a%3, Math.min(b%3, (a+b)%3))==0?"Possible":"Impossible");
    }

}