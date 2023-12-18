import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();

        int sum = 0;
        for(int i = l; i < l + n; i++){
            sum += i;
        }
        System.out.println(sum);
        
        if(l < 0 && (l + n - 1) <= 0){
            sum -= (l + n - 1);
        } else if(l >= 0 && (l + n - 1) > 0){
            sum -= l;
        }

        System.out.println(sum);
    }
}