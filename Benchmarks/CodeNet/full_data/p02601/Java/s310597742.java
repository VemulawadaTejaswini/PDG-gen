import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int g = s.nextInt();
		int b = s.nextInt();
		int k = s.nextInt();
		
		int flag=0;
		for(int i=0;i<k;i++) {
			for(int j=0;j<k;j++) {
				for(int l=0;l<k;l++) {
					if(i+j+l==k) {
						int r1 = r*(int)Math.pow(2, i);
						int g1 = g*(int)Math.pow(2, j);
						int b1 = b*(int)Math.pow(2, l);
						
						if(r1<g1 && g1<b1) {
							//System.out.println(r1+" "+g1+" "+b1);
							System.out.println("Yes");
							flag=1;
							break;
						}
					}
					
				}
				if(flag==1) {
					break;
				}
			}
			if(flag==1)
				break;
		}
		
		if(flag==0) {
			System.out.println("No");
		}
		
	}

}