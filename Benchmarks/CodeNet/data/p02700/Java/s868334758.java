import java.util.Scanner;

class Main{
      public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  int a,b,c,d;
	  a = sc.nextInt();
	  b = sc.nextInt();
	  c = sc.nextInt();
	  d = sc.nextInt();
	  while(true){
	      b-=c;
	      if(b<=0){
		  System.out.println("Yes");
		  break;
	      }
	      a-=d;
	      if(a<=0){
		  System.out.println("No");
		  break;
	      }
	  }
      }
}
