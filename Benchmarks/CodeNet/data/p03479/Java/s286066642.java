import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long X = sc.nextLong();
        Long Y = sc.nextLong();
        Long sum = X * 2;
        int count = 2;
        
        while(true){
            sum = sum * 2;
            if(sum > Y){
                System.out.println(count);
                System.exit(0);
            }
            count++;
            if((X-1) == count){
                System.out.println(count);
                System.exit(0);
            }
        }
    }
}