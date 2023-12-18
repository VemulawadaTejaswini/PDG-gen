import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Long N = scanner.nextLong();

        long sum = 0;
        for(long i=1; i <= N; i++){
            if(1%15!=0 && i%3 != 0 && i%5 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}