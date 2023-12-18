import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
	        int ans = 0; 
		for( int a=0; a<=k; a++ ){
			for(int b=a; b<=k; b++){
				for(int c=b; c<=k; c++){
					if(a+b+c==s){
						ans++;
					}
				}
			}
		}

		System.out.println(ans);
		return;
	}
}