import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		while(true){
			 
			 int x = Integer.parseInt(s.next());
			 int y = Integer.parseInt(s.next());
			 
			 if(x==0 && y==0){
				 break;
			 }
			 if(x<y){
				 System.out.println(x+" "+y);
			 }else{
				 System.out.println(y+" "+x);
			 }	 

		}
	}

}