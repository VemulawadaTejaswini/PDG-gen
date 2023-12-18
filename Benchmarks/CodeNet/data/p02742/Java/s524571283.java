import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long w = sc.nextLong();

        long t = 0;
        if(h%2==1&&w%2==1) {
            t = ((h*w)/2)+1;
        } else {
            t = (h*w)/2;
        }
        System.out.println(t);
    }
}