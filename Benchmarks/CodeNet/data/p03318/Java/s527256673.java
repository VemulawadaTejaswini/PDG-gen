import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		if(k<=9){
			for(int i=1; i<=k; i++){
				System.out.println(i);
			}
		}else{
			for(int i=1; i<=9; i++){
				System.out.println(i);
			}
			long count = 10;
			for(long j=1; j<=k-9; j++){
				System.out.println(((j)*count)+count-1);
				if(j%9==0){
					j/=9;
					j-=1;
					k-=9;
					count*=10;
				}
			}
		}
	}
}