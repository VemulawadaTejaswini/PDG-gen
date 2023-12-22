import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = (long)(sc.nextDouble()*100+0.9);
        
        long res = A*B/100;
        
        System.out.println(res);
    }

}

