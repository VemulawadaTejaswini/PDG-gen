import java.util.*;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long total = 1;
        for(int i = 0; i < num; i++){
          total *= sc.nextLong();
          if(total > Math.pow(10, 18)){
            total = -1;
            break;
          }
        }
        System.out.println(total);
    }
}