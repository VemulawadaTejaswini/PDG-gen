import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int k = 0;
        for(int i = 1;i <= n; i++){
            int u = sc.nextInt();
            if(!(x - u < 0)){
                x = x - u;
                ++k;
            }
        }
        System.out.println(k);
    }
}
