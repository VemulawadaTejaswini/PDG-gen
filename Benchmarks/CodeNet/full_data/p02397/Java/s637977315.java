import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y,tmp;
		
		do {
			x=sc.nextInt();
			y=sc.nextInt();
				
			if(x>y) {
				tmp=y;
				y=x;
				x=tmp;
			}
			
			if(x==0&&y==0) break;
			
			System.out.println(x+" "+y);
			       
		    
		 }while(true);
		
		
		
    }
}
