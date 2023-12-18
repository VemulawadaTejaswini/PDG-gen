import java.util.*;
public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		String s =sc.next();
		int t=0;
		for(int i=0;i<c-2;i++) {
			for(int j=i+1;j<c-1;j++) {
				for(int k=i+2;k<c;k++) {
					if(j-i!=k-j) {
						if(s.charAt(i)!=s.charAt(j)&&s.charAt(i)!=s.charAt(k)
								&&s.charAt(j)!=s.charAt(k)) {
							t++;
							
						}
					}
				}
			}
		}
		System.out.println(t);


	}

}
