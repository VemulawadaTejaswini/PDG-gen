import java.util.*;
public class MainB{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		boolean jud = false;
		
		int a1 = a;
		int b1 = b;
		int c1 = c;		
		
		for(int i = 0 ; i < k; i++){
			if(judge(a1,b1,c1)) jud = true;
			c1 = c1*2;
			if(judge(a1,b1,c1)) jud = true;
			for(int j = 0; j < k-i; j++){
				b1 = b1*2;
				if(judge(a1,b1,c1)) jud = true;
			}
			b1 = b;
		}
		
		if(jud == true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	
	public static boolean judge(int a, int b, int c){
		if((a < b)&&(b < c)){
			return true;
		}else{
			return false;
		}
	}
}