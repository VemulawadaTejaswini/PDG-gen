import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		long x = Long.parseLong(b);
		long count1 = x;
		long count2 = 1;
		long q = 2;
		if(a==1){
			System.out.println(b);
			return;
		}
		for(long i = q; i <= count1; i++){
			double c = Math.pow(i,a);
			if(c > count1 && count2!=1){
				System.out.println(count2);
				return;
			}
			if(c > count1){
				break;
			}
			if(c <= count1){
				if(count1%c==0){
					count1 /= c;
					count2 *= i;
					q=2;
					if(count1 == 0){
						System.out.println(count2);
						return;
					}
				}
			}
		
			
		}
			System.out.println(1);
	}
}