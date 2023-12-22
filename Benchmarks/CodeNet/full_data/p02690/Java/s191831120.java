import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		outside: for(int i=0; i<=5000; i++){
			for(int j=0; j<=5000; j++){
				long A5 = i*i*i*i*i;
				long B5 = j*j*j*j*j;
				long B52 = -j*-j*-j*-j*-j;
				if(A5-B5 == x){
					System.out.println(i+" "+j);
					break outside;
				}
				if(A5-B52 == x){
					System.out.println(i+" "+(-j));
					break outside;
				}
			}	
		}
	}
}
