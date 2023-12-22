import java.util.Scanner;
public class Main {
  public static void main(String[] args){
	Scanner sc =  new Scanner(System.in);
	while(true){
		int H = sc.nextInt();
		int x = sc.nextInt();
		if(H==0 && x==0){
			break;
		}
		for(int i=1;i<=H;i++){
			for(int j=1; j<=x; j++){
			 System.out.print("#");	
			}
			 System.out.println();
		}
		
		  System.out.println();			
	}  	  
	  
  }
}