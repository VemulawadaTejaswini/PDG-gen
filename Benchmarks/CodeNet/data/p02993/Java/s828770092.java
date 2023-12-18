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
		
		int intArray[] = new int[4];

		for(int i = 0 ;i < 4;i++){
			intArray[i] = a % 10;
			a = a / 10;
		}
		for(int i = 0 ;i < 3;i++){
			if(intArray[i] == intArray[i+ 1]){
				System.out.println("Bad");
				return ;
			}	
		}

		System.out.println("Good");


	    
   		sc.close();
        return ;

    }
    
}

