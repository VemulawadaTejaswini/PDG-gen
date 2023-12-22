import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] ans = new int[3];
		for(int i=0;i<ans.length;i++) ans[i] = in.nextInt();
		
		Arrays.sort(ans);
		for(int i=0;i<ans.length;i++) System.out.print(ans[i]+" ");
		System.out.println();
	}

}