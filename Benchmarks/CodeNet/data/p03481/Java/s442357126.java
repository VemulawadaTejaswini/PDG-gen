import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long i = 1;
            long a = x;
            while (a <= y){
                a=a*2;
                i++;
            }
           System.out.println(i-1);
        }