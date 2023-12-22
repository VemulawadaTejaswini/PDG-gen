import java.util.*;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long start = 100;
        long interest = 0;
        long count = 0;
        while(true){
          	interest = 0;
          	count++;
            interest += (start/100);
            start += interest;
            if(X <= start){
                System.out.println(count);
              	break;
            }
        }
    }
}
