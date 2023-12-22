import java.util.*;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int t[] = new int[3];
		
		int l = sc.nextInt();
		for(int i = 0; i < l; i++){
			t[0] = sc.nextInt();
			t[1] = sc.nextInt();
			t[2] = sc.nextInt();
			Arrays.sort(t);
			
			if(t[0]*t[0] == t[2]*t[2] - t[1]*t[1] && 
			   t[1]*t[1] == t[2]*t[2] - t[0]*t[0] &&
			   t[2]*t[2] == t[0]*t[0] + t[1]*t[1]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}