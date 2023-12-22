import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n % 1000 == 0 ? 0 : 1000 - (n % 1000));
        scan.close();
    }
}
