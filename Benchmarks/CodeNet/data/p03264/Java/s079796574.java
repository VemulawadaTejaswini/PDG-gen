import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int K = sc.nextInt();
		int ans;
		
		int amari = K % 2;
		int div = K / 2;
		if(amari == 1){
			ans = div *(div + 1);
		}else{
			ans = div * div;
		}
   		System.out.println(ans);
		
   		sc.close();
        return ;

    }
    
}

