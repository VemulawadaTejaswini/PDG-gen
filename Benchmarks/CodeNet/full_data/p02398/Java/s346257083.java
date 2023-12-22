import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(numberOfDivisors(a,b,c));
    }
    public static int numberOfDivisors(int a, int b, int c){
        int count = 0;
        for(int i = a; i <= b; i++){
            if(c % i == 0){
                count++;
            }
        }
        return count;
    }
}
