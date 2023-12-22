import java.util.Scanner;

public class Ans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = sc.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            if(a<max){
                count += max-a;
                a = max;
            }
            else if(a>max){
                max = a;
            }
        }
        System.out.println(count);
    }
}
