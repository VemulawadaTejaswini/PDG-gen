import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int x=sc.nextInt(),y=sc.nextInt();
	  for(int i=0;i<=x;i++) {
		  if(i*2+(x-i)*4==y) {
			  System.out.println("Yes");
			  System.exit(0);
		  }
	  }
	  System.out.println("No");
  }
}

