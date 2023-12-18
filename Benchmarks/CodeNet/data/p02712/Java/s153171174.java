import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        long out = 0;
        for(long i = 0; i < n; i++){
            if(i % 3 != 0 && i % 5 != 0){
                out += i;
            }
        }
        System.out.println(out);
    }
}