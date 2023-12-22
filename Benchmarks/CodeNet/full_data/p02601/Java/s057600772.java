import java.util.Scanner;
public class Main{
public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	int r=sc.nextInt();
	int g=sc.nextInt();
	int b=sc.nextInt();
	int k=sc.nextInt();
	while(k>0) {
		if(b<g&&b<r) {
			b=b*2;
			
		}else if(g<r) {
			g=g*2;
			
			
		}else if(r<g&&g<b) {
			b=b*2;
			
		}else if(b<g||b<r) {
			b=b*2;
			
		}else if(r==b&&b==g) {
			b=b*2;
			
		}else if(r==g) {
			g=g*2;
			
		}
		
		k--;
	}
	int flag=0;
	if(b>g&&g>r) {
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}
	
	
}
}