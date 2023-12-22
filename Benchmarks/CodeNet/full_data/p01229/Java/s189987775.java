import java.util.*;
import java.math.*;
import java.text.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<80; i++){
			list.add(0);
		}
		int n = in.nextInt();
		for(int i=0; i<n; i++){
			int l = in.nextInt();
			for(int k=0; k<l; k++){
				list.set(k, in.nextInt());
			}
			int ans = 0;
			for(int j=0; j<l; j++){
				if(l%2 != j%2) ans = ans+list.get(j);
				else if(list.get(j)==0) ans--;
			}
			System.out.println(ans);
		}
	}
}