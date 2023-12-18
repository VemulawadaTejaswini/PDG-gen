import java.util.*; 
import java.lang.*; 
 
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		String S = scan.next();
		
		char a;
		char b;
		char c;
		
		int sum = 0; 
		
		if(N==1 || N==2){
			System.out.println("0");
		}

		if(N>=3){
		
			for(int i = 0; i<=N-3; i++){
				for(int j = i+1; j<=N-2; j++){
					for(int k = j+1; k<=N-1; k++){	
						if((j-i)!=(k-j)){
							 a = S.charAt(i);
							 b = S.charAt(j);
							 c = S.charAt(k);
							 
							 if( a!=b && b!=c && c!=a ){
							 	sum++;
							 }
						}
					}
				}
			}
			
			System.out.println(sum);
		}
	}
}