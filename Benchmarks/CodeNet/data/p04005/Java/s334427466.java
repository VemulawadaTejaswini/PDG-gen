import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        int b = i.nextInt();
        int c = i.nextInt();

        int d = a * b;
        if(d % 2 != 0){
            System.out.println(a * b);
        }else{
            System.out.println("0");
        }
    }
}
