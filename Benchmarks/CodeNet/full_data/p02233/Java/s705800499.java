import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int ????????????????????????
        int a = sc.nextInt();
        int result = calc(a);
        System.out.println(result);
    
    }
    int calc(int n){
    if (n == 0 || n == 1){
        return 1
     }else{
        return calc(n - 2) + calc(n - 1)
     }
}
}