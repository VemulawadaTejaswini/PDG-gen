import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long m=sc.nextLong();
		if(n%2==1){
			for(int i=0;i<m;i++){
				System.out.println((i+1)+" "+(n-(i)));
			}
		}else{
			for(int i=0;i<m;i++){
				if(i%2==0){
					System.out.println((i/2+1)+" "+(n-(i/2)));
				}else{
					System.out.println((n/2-i/2)+" "+(n/2+i/2+2));
				}
			}
		}
	}
}
