import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, sum = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for(int i = 1 ; i <= N ; i++)
        {
            sum += (((i%3 ==0) || (i%5==0))? 0 : i);
        }
        System.out.println(sum);
    }
}
