import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int total1 = N * A;
        int total2 = B;
        if(total1 < total2){
            System.out.println(total1);
        }else{
            System.out.println(total2);
        }
    }
}
