import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int N = s.length();
		int K = sc.nextInt();
		String[] sub = new String[N*(N+1)/2];
		s = s + "A";
		int a = 0;
		for( int i=0; i<N; i++ ){
			for( int j=i+1; j<=N; j++ ){
				sub[a] = s.substring(i,j);
				a++;
			}
		}
		Arrays.sort(sub);
		int b = 0;
		for( int i=0; i<N*(N+1)/2-1; i++ ){       
			if( !(sub[i].equals(sub[i+1])) ){
				b++;
			}      
			if( b==K ){
				System.out.println(sub[i]);             
				break;
			}
		}  
		if( N==1 ){
			System.out.println(sub[0]);          
        }          
	}
}
