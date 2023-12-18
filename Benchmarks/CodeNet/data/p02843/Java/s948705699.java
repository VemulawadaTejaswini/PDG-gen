import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int min = 100;
		int max = 10500000;
		int ans = 0;
		
		for(int i=0; i*100<=x; i++){
		    min = 100*i;
		    max = 105*i;
		}
		
		if(x >= min && x <= max){
		    ans = 1;
		}
		
		System.out.println(ans);
	}
}
