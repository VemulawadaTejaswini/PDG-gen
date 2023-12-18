import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        while(n/k>k){
            n = n/k;
        }
        System.out.println(n%k);
    }
}