import java.util.*;

public class Main{
	public static void main(String args[]){
		
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		int z;
		int e=0;
		int f=0;
		int g;
		int h=0;
		int r;
		int count=0;
		
		for(int i=0;i<a;i++){
			int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
			
			
			g=(c+d)-(e+f);
			z=Math.abs(g);
			
			b=b-h;
			r=Math.abs(b);
			r=r-z;
			
			
			if(r>=0 && r%2==0){
				e=c;
				f=d;
				h=b;
				
				if(count==0 && i==a-1){
					System.out.println("yes");
				}	
			}
				else if(r<0 || r%2==1){
				count++;
			}
			
		}
		
		if(count>0){
		System.out.println("no");
		}
		
	}
}
