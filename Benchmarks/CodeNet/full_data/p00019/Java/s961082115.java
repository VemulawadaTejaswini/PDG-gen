import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        long factrial = 1;
        while(i > 0){
            factrial *= i;
            i--;
        }
        System.out.println(factrial);
    }
}
