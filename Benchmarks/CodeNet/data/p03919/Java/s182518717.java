import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		String ans = null;
		for(int i=0; i<H; i++)
			for(int j=0; j<W; j++)
				if(sc.next().equals("snuke"))
					ans = String.valueOf((char)('A'+j))+(i+1);
		
		System.out.println(ans);
		sc.close();
	}
}
