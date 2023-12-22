import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[] s = new int [r*c+1];
        int t, sum;
        for(int i = 0; i < r; i++)
        {
            sum = 0;
            for(int k = 0; k < c; k++)
            {
                t = sc.nextInt();
                sum += t;
                s[k] += t;
                System.out.print(t + " ");
            }
            s[c] += sum;
            System.out.println(sum);
        }
        for(int i = 0; i < c; i++){
            System.out.print(s[i] + " ");
        }
        System.out.println(s[c]);
    }

}