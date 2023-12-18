import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList x=new ArrayList<>();
		int n=sc.nextInt();
		boolean can = true;
		for(int i=0;i<n;i++) {
			int m=sc.nextInt();
			if(x.contains(m)) {
				System.out.println("NO");
				can = false;
				break;
			}else {
				x.add(m);
			}	
		}
		if(can)
			System.out.println("YES");
	}
	
}
