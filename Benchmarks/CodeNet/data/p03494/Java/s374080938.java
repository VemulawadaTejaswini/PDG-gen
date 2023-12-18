import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int n = sc.nextInt();
        int temp = 0 ;
        for (int i = 0;i<n ;i++){
            temp += sc.nextInt();
        }
        while (temp%2 ==0){
            temp /= 2;
            ans ++;
        }


        System.out.println(ans);
    }


}
