import java.util.*;
public class Main {// Main
    public static void main(String[] args){
       	Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long count = 0;
        for(int i=1;i<=a;i++) {
            if(i % 3 == 0 && i % 5 == 0) {

            } else if(i % 3 == 0) {

            } else if(i % 5 == 0) {

            } else {
                count += i;
            }
        }
        System.out.println(count);
    }
}
