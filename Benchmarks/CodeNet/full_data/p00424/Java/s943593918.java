import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			String[] s = new String[n];
			String[] t = new String[n];
			for(int i=0;i<n;i++){
				s[i] = sc.next();
				t[i] = sc.next();
			}
			int m = sc.nextInt();
			boolean exit=true;
			for(int i=0;i<m;i++){
				String u = sc.next();
				exit=true;
				for(int j=0;j<n;j++){
					if(u.compareTo(s[j])==0){
						System.out.print(t[j]);
						exit=false;
						break;
					}
				}
				if(exit==true)System.out.print(u);
			}
			System.out.println();
		}
	}
}