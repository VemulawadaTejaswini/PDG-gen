import java.util.Scanner;
public class Main1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		String ans ="";
		int q = scan.nextInt();
		boolean con = true;
		
		for(int i=0;i<q;i++) {
			int t = scan.nextInt();
			if(t==1) {
				int count = 1;
				while(con) {
					i += 1;
					int x = scan.nextInt();
					if(x==1) {
						count += 1;
						if(i==q-1) {
							con = false;
							if(count%2==0) {
								continue;
							}else {
								for(int j=s.length()-1;j>=0;j--) {
									ans += s.charAt(j);
								}
								s = ans;
								ans = "";
							}
							
							int f = scan.nextInt();
							if(f==1) {
								ans += scan.next();
								ans += s;
								s=ans;
								ans ="";
							}else if(f==2){
								s += scan.next();
							}
						}
						
					}else {
						con = false;
						if(count%2==0) {
							continue;
						}else {
							for(int j=s.length()-1;j>=0;j--) {
								ans += s.charAt(j);
							}
							s = ans;
							ans = "";
						}
						
						int f = scan.nextInt();
						if(f==1) {
							ans += scan.next();
							ans += s;
							s=ans;
							ans ="";
						}else if(f==2){
							s += scan.next();
						}
					}
				}
							
			}else if(t==2) {
				int f = scan.nextInt();
				if(f==1) {
					ans += scan.next();
					ans += s;
					s=ans;
					ans ="";
				}else if(f==2){
					s += scan.next();
				}
			}
		}
		
		System.out.println(s);
		
	}	
}
