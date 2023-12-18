import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(new Main().roller_coaster(k, h));

    }

    public int roller_coaster(int k, int[] h){
        int count = 0;
        for(int height : h){
            if(height >= k){
                count++;
            }
        }
        return count;
    }
}
