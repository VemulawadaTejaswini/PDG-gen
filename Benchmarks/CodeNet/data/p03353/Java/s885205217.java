import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int N = s.length();
		int K = sc.nextInt();
		int count = 0;
		if( N>=5 ){
			count = (N-4)+10;
		}else{
			count = N*(N+1)/2;
		}
		String[] sub = new String[count];
		s = s + "A";
		int a = 0;
		if( N>=5 ){
			for( int i=0; i<N-5; i++ ){
				for( int j=i+5; j<=N; j++ ){
					sub[a] = s.substring(i,j);
					a++;
				}
			}
			N = 4;
		}else{
			for( int i=0; i<N; i++ ){
				for( int j=i+1; j<=N; j++ ){
					sub[a] = s.substring(i,j);
					a++;
				}
			}
		}
		Arrays.sort(sub);
		int b = 0;  
		if( N>1 ){	//
		for( int i=0; i<a; i++ ){  
			if( !(sub[i].equals(sub[i+1])) ){
				b++;
			}      
			if( b==K ){
				System.out.println(sub[i]);             
				break;
			}
		}  
		}  		// 
		if( N==1 ){
			System.out.println(sub[0]);
		} 
	}
}
