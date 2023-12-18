import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		if( (H-h)%2==0 || (W-w)%2==0 ) System.out.println("No");
		
		System.out.println("Yes");
		long s = Math.max(1, (h-1)*(w-1));
		long x = (-1)*h*w/s;
		for(int i=0; i<H; ++i){
			for(int j=0; j<W-1; j++){
				if(i%h==0 || j%w==0) System.out.print(1+" ");
				else System.out.print(x+" ");
			}
			System.out.println(1);
		}
		return;
	}
}