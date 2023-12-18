import java.util.*;
class Main{
	static Scanner scan = new Scanner(System.in);
	static void crackers(){
		int n = scan.nextInt(), k = scan.nextInt();
		int m;
		if(n%k==0)
			m = 0;
		else
			m = 1;
		System.out.println(m);
	}
	static void buy(){
		int n = scan.nextInt();
		for(int i=0;i<=n/4;i++){
			for(int j=0;j<=n/7;j++){
				if(4*i + 7*j == n){
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
	public static void main(String[] argv){
		//crackers();
		buy();
	}
}