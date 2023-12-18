import java.util.*;
public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		String s =sc.next();
		int t=0;
		for(int i=0;i<c-2;i++) {
			for(int j=i+1;j<c-1;j++) {
				for(int k=j+1;k<c;k++) {
					if(j-i!=k-j) {
						if(s.charAt(i)!=s.charAt(j)&&s.charAt(i)!=s.charAt(k)&&
								s.charAt(k)!=s.charAt(j)) {
							t++;
						}
					}
				}
			}
		}
		
		System.out.println(t);



	}

}
