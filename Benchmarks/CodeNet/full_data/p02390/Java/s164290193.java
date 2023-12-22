import java.util.Scanner;
  
public class Main {
	
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int S=Integer.parseInt(sc.next());
	 
	  int h=S/(60*60);
	  int m=(S-h*3600)/60;
	  int s=(S-3600*h-60*m);
	  
	  System.out.println(h +":"+ m +":" + s);
    
  }
}