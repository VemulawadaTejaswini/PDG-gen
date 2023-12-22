
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String box = sc.next();
            int sum = 0;
            for(int i=0; i<box.length(); i++){
                sum+=box.charAt(i)-'0';
            }

            System.out.printf("%d\n",sum);
        }
    }
}

