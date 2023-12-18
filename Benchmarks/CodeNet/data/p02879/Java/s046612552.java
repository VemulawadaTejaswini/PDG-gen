import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int nam = sc.nextInt();
		int nam2 = sc.nextInt();
		
		int ans = -1;
		if(nam>=1 && nam<=9){
		    if(nam2>=1 && nam2<=9){
		        ans = nam * nam2;
		    }
		}
		
		System.out.println(ans);
	}
}
