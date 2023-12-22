import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int minv=sc.nextInt();
		int maxv=-1000000000;
		for(int j=1; j<n; j++){
			int x=sc.nextInt();
			maxv=max(maxv,x-minv);
			minv=min(minv,x);
		}
		System.out.println(maxv);
	}
	public static int max(int x,int y){
		if(x>y){
			return x;
		}else{
			return y;
		}
	}
	public static int min(int x,int y){
		if(x<y){
			return x;
		}else{
			return y;
		}
	}

	}
