import java.util.*;
 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String[] r = s.split("");
		int c =0;

		for(int i = 0;i<n-1;i++) {
	
			if(r[i].equals(r[i+1])){
				r[i] = r[i].replace(r[i],"");
			}
		}
		
		for(int i = 0;i<n;i++) {
			if(!(r[i].equals(""))) {
				c++;
			}
		}
		


		

		System.out.println(c);
 
		sc.close();
	}
}