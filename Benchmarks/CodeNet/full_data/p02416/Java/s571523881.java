import java.util.*;

public class Main{

	public static void main(String[] args) {
		int x;
		int ans = 0;
		int[] n = new int[1000];
		while(true){
			Scanner scn = new Scanner(System.in);
			String inl = scn.nextLine();
			x = Integer.parseInt(inl);
			if(x == 0) break;
			String[] part = inl.split("");
			for(int i = 0 ; i < part.length ; i++){
				n[i] = Integer.parseInt(part[i]);
				ans += n[i];
			}
			System.out.println(ans);
		}
	}	
}