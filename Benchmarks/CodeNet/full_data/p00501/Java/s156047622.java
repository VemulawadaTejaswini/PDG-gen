import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String name = sc.next();
		int ans = 0;
		for(int i=0;i<N;i++) {
			String oldName = sc.next();
			boolean ok2 = false;
			for(int j=0;j<=oldName.length()-name.length();j++) {
				for(int k=1;k*(name.length()-1)+1+j<=oldName.length();k++) {
					boolean ok = true;
					for(int l=0;l<name.length();l++) {
						//System.out.println(j+","+k+","+l);
						if(name.charAt(l)!=oldName.charAt(j+k*l)) {
							ok=false;
						}
					}
					if (ok) {
						ok2=true;
						break;
					}
				}
				if(ok2) {
					break;
				}
			}
			if(ok2) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}