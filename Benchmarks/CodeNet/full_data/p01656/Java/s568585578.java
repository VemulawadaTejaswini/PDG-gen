import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		boolean f = false;
		String ans = "kogakubu10gokan";
		String pre = "kogakubu10gokan";
		for(int i=0;i<n;i++){
			int y = sc.nextInt();
			String nex = sc.next();
			if(!f && y>q){
				f = true;
				ans = pre;
			}
			pre = nex;
		}
		System.out.println(ans);
	}

}