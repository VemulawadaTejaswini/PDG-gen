import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = x % 100;
        int p = x / 100;
        for(int i = 0;i < p;i++){
            if(n >= 5){
                n -= 5;
            }else if(n == 4){
                n -= 4;
            }else if(n == 3){
                n -= 3;
            }else if(n == 2){
                n -= 2;
            }else if(n == 1){
                n -= 1;
            }else if(n == 0){
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }
}