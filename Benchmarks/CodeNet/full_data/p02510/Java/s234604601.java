import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in); 
		while(true){
			String x;
			int m;
			x=cin.next();
			if(x.equals("-")){
				break;
			}
			m=cin.nextInt();
			for(int i=0;i<m;i++){
				int h=cin.nextInt();
				x=x.substring(h)+x.substring(0,h);				
			}
			System.out.println(x);
		}	
	}

}