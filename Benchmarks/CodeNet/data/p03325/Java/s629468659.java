import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = 0;
        int n = sc.nextInt();
        for (int i = 0;i < n;++i){
            int a = sc.nextInt();
            while (a % 2 == 0){
                ++k;
                a /= 2;
            }
        }
        System.out.println(k);
    }


}
