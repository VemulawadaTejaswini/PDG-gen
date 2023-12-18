import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n=sc.nextInt();
		int m=sc.nextInt();
		sc.nextLine();
		int[] map=new int[128];
		for(int i=0;i<n;i++){
			String str=sc.nextLine();
			for(char c:str.toCharArray()){
				map[c]++;
			}
		}

		int one=(n%2)*(m%2);
		int two=(n/2)*(m%2)+(n%2)*(m/2);
		int four=(n/2)*(m/2);

	
		for(int i='a';i<='z';i++){
			four-=map[i]/4;
			map[i]%=4;
			two-=map[i]/2;
			one-=(map[i]&1);
		}

		if(one==0&&two==0&&four==0)
			System.out.println("Yes");
		else
			System.out.println("No");		
		
	}
}
