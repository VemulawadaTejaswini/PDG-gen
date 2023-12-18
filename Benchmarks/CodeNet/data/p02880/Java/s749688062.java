import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean b = false;
        for(int i = 1; i < 10; i++){
            if(a % i == 0 && a / i <= 9){
                b = true;
            }
        }
        if(b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}