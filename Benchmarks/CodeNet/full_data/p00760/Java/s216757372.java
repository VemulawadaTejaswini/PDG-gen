import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n; 
		n=cin.nextInt();
		for(int i=0;i<n;i++){
			int y,m,d,x=0;
			y=cin.nextInt();
			m=cin.nextInt();
			d=cin.nextInt();
			x=x+(y-1)*195+(y-1)/3*5;
			if(y%3==0){
				x=x+(m-1)*20;
			}
			else if(y%3!=0){
				if(m%2==0){
					x=x+(m-1)*19+(m/2);
				}
				else if(m%2!=0){
					x=x+(m-1)*19+(m/2+1);
				}
			}
			x=x+d;
			System.out.println(196471-x);
		}
	}

}