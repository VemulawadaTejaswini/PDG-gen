import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans [] = {0,1,2};
        
        if ( a == 1 ){
        	ans[0] = 1;
        } else {
        	ans[0] = 9;
        } if (b == 1){
        	ans[1] = 1;
        } else {
        	ans[1] = 9;
        } if ( c == 1 ){
        	ans [2] = 1;{        	}
        } else {
        	ans[2] = 9;
        }
        
        System.out.print(ans);
         }
        
    }
 