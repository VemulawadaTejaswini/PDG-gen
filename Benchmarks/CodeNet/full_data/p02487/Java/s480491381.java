import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		solve();
	}

	private static void solve(){
		Scanner sc=new Scanner(System.in);

		while(true){
			int h,w;
			h=sc.nextInt();
			w=sc.nextInt();
			if(h+w==0)break;
			for(int y=0;y<h;y++)
			for(int x=0;x<w;x++){
				boolean t=x==0||y==0||x==w-1||y==h-1;
				System.out.println(t?"#":".");
			}
		}
	}
}