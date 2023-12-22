import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int x = s.nextInt();
            int k = s.nextInt();
            int c=0;
            while (n > 0){
                n = n - x;
                c+=1;
            }
            System.out.println(k*c);
    }
    }
