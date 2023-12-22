import java.util.Scanner;

class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int[] nArray = new int[n];
	  for(int i=0;i<n;i++){
		  nArray[i]=sc.nextInt();
	  }
	  for(int i=0;i<n-1;i++){
		  System.out.print(nArray[n-1-i]+" ");
	  }
	  System.out.println(nArray[0]);
  }
}