import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for(int j=0;j<i;j++){
			a=a+1;
			b=b+1;
			c=c+1;
			d =d+1;
		    
			if(a%3==0||a%10==3){
				System.out.print(" "+a);//" aは"
			}
				else {
					while(b > 0) {
					    if(b % 10 == 3) {
					        // 3が付く数値である
					    	
					        break;
					       
					    }
					    b /= 10;
					    c = d;
					    
					    //System.out.print(" x"+c+"x ");
					    
					} 
				}
				 
				
			}
		
		
	}
}
