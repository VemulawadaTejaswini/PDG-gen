import java.util.Scanner;
public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] arg){
        Main m = new Main();
        m.run();
    }

    void run(){
        for(;;){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            int a[] = new int[n];

            int sum = 0;
            for(int i = 0 ; i< n ;i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }

            int res = 0;
            for(int i = 0; i < n ; i++){
                if(a[i] * n <= sum){
                    res ++;
                }
            }
            System.out.println(res);
        }

    }
}

