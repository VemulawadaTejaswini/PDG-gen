import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		String Nlen = Integer.toString(N);
		
		int kijyun = N / 100;

		for(int i = 0;i < Nlen.length() -1 ;i++){
			int tmp = N % 10;
			if(tmp <= kijyun){
			}else{
				kijyun ++;
				System.out.println(Integer.toString(kijyun) + Integer.toString(kijyun) + Integer.toString(kijyun) );
		   		sc.close();
				return;
			}
			N = N / 10;
		} 

		System.out.println(Integer.toString(kijyun) + Integer.toString(kijyun) + Integer.toString(kijyun) );

   		sc.close();
        return ;

    }
    
}

