import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		int n,a,b,c;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if(a*a+b*b==c*c || a*a+b*b==c*c || b*b+c*c==a*a){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}