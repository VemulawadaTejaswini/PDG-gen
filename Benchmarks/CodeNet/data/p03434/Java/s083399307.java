import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		int c;
		
		for(int i = 0; i < n; i++){
			c = sc.nextInt();
			a.add(c);
		}
		Collections.sort(a);
		Collections.reverse(a);

		int x = 0;
		int y = 0;
		
		for(int i = 0; i < n; i++){
			if((i+1) % 2 != 0){
				x = x + a.get(i);
			}else{
				y = y + a.get(i);
			}
		}
		int ans = x - y;
		System.out.println(ans);
	}
}
