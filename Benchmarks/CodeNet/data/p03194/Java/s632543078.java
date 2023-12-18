import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		long x = Long.parseLong(b);
		long count1 = 0;
		long count2 =0;
		if(a==1){
			System.out.println(b);
			return;
		}
		if(x%2==0){
			for(long i = 2; i < x; i += 2){
				double c = Math.pow(i,a);
				if(c>x && count1 != 0){
					System.out.println(count1);
					return;
				}
				if(c<=x){
					if(x%c==0){
						count1 = i;
					}
				}
			}
		}else{
			for(long i = 3; i < x; i += 2){
				double d = Math.pow(i,a);
				if(d>x && count2 !=0){
					System.out.println(count2);
					return;
				}
				if(d<=x){
					if(x%d==0){
						count2 = i;
					}
				}
			}
		}
			System.out.println(1);
	}
}