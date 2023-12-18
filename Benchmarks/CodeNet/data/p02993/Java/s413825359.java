import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		
		int ans = a % 10;
		a = a / 10;
		if(a % 10 == ans ){
			System.out.println("Bat");
			return ;
		}

		ans = a % 10;
		a = a / 10;
		if(a % 10 == ans ){
			System.out.println("Bat");
			return ;
		}

		ans = a % 10;
		a = a / 10;
		if(a % 10 == ans ){
			System.out.println("Bat");
			return ;
		}

		System.out.println("Good");


	    
   		sc.close();
        return ;

    }
    
}

