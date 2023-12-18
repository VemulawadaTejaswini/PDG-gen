import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int num = 0;
        int count = 0;
        while(num<b) {
            if(count == 0) {
                num += a;
            } else {
                num += a;
                num -= 1;
            }
            count++;
        }
        System.out.println(count);     
    }
}