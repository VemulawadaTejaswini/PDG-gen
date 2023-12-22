import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int a= sc.nextInt();
		  
		  for(int i=1;i<=a;i++){
			  if(3*i>a){
				  System.exit(0);
			  }else{
				  System.out.print(3*i);
				  System.out.print(" ");
			  }
		  }
	  }

}