import java.util.Scanner;

public class execirce4242 {
    public static void main(String[] args){
  	  Scanner sc = new Scanner(System.in);
  	  int n = sc.nextInt();  	  
  	  for(int i=1;i<=n;i++){
  		  if(i%3 == 0){
  			  System.out.printf(" %d",i);
  		  } else{
  			  function(i,i);
  		  }
  	  }
	System.out.println("");
    }
  	  
  	  public static void function(int i,int j){
  		  if(j%10 == 3){
  			  System.out.printf(" %d",i);
  		  } else if(j>0){
  			  function(i,j/10);
  		  }
  	  }
    }