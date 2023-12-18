import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int num = 0;

        if(a < n && b < n) {
            if (a < b) {
                while (a != b) {
                    a++;
                    b--;
                    num++;
                    System.out.println(num);
                }
            }
            else if(b < a) {
                while (a != b) {
                    a--;
                    b++;
                    num++;
                    System.out.println(num);
                }
            }
        }

    }
}
