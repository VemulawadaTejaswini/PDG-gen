import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long count=1;
		if(a<b-2 && k-a-1>=0){
			count+=(k-a-1)/2;
			System.out.println(k+1+(b-2-a)*(count));
		}else{
			System.out.println(k+1);
		}
	}
}