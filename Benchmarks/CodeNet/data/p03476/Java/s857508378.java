import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int ori, end, count;
		while((n--)>0) {
			count = 0;
			ori = cin.nextInt();
			end = cin.nextInt();
			for(int i=ori; i<=end; i++) {
					if((Function(i) > 0)) 
						if(Function((i+1)/2) > 0)
							count ++;
			}
			System.out.println(count);
		}
	}
	static int Function(int x) {
		if(x==1) {
			return 0;
		}
		for(int i=2; i<=(int)Math.sqrt(x); i++) {
			if(x%i==0)
				return 0;
		}
		return 1;
	}
}
