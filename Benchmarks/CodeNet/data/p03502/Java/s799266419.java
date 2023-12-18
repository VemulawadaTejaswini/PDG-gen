import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        for(Integer it :list) {
            sum+=it;
        }
        if (n%sum==0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}