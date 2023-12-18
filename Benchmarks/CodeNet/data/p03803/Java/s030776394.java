import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] s= {2,3,4,5,6,7,8,9,10,11,12,13,1};
		int a=sc.nextInt(),b=sc.nextInt();
		for(int i=0;i<13;i++) {
			if(a==s[i]){
				a=i;
			}
			if(b==s[i]) {
				b=i;
			}
		}
		System.out.println((a<b)?"Bob":(a>b)?"Alice":"Draw");
		sc.close();
	}
}