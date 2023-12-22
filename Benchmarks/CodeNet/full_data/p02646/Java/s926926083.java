import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long V = sc.nextLong();
        long B = sc.nextLong();
        long W = sc.nextLong();
        long T = sc.nextLong();
        long dist = Math.abs(A-B);
        if(((V-W)*T) >= dist){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

}
