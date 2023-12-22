import java.util.Scanner;

  
public class Main {
	
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int x;
	  int i=0;
	  int n=Integer.MAX_VALUE;
	  for(i=1;i<n;i++){
		  x=Integer.parseInt(sc.next());
		  if(x!=0){
		  System.out.println("Case " + i +": " + x );
		  }
		  else{
			  
			  break;
		  }
		  
	  }
	  
    
  }
}