import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int t=b;
		int j=1;
		int ab;
		while(t>0) {
			if(t/10>=10) {
				j++;
			}
			t=t/10;
		}
		System.out.println("j="+j);
		for(int i=0;i<=j;i++) {
			a=a*10;
		}
		System.out.println(a);
		ab=a+b;
		System.out.println(ab);
		for(int i=1;i<=ab/2;i++) {
			if(ab==i*i) {
				System.out.println("Yes");
				break;
			}
			else if(ab!=i*i&&i==ab/2){
				System.out.println("No");
			}
		}
	}

}
