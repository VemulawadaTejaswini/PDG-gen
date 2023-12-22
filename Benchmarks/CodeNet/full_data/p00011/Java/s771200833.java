import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int n = sc.nextInt();

        int[] num = new int[w];

        for(int i = 0; i < w; i++)
            num[i] = i + 1;

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int tmp = num[a - 1];
            num[a - 1] = num[b - 1];
            num[b - 1] = tmp;
        }
        
        for(int i = 0; i < n; i++)
            System.out.println(num[i]);

        sc.close();
    }
}
