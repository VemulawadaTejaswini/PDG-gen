import java.util.Scanner;

class Main{
      public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  int sheep,wolf;
	  sheep = sc.nextInt();
	  wolf = sc.nextInt();
	  if(wolf>=sheep){
	      System.out.println("unsafe");
	  }else{
	      System.out.println("safe");
	  }
      }
}
