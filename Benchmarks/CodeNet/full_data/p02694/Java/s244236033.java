import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        int time = 0;
        long value = 100;

        while(X > value){
            value = (long)(value*1.01);
            time++;
        }

        System.out.println(time);
    }
}
