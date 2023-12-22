import java.util.Scanner;

public class Main { 
  public static void main(String[] args){
	  long max = -1000000;
	  long min = 1000000;
	  long sum=0;
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  for(int i=0;i<n;i++) {
	  int a = sc.nextInt();
	  if(a<=min)
		  min=a;
	  if(a>max) 
		  max=a;
	  sum = a++;
	  }
	  System.out.printf("%d %d %d",min,max,sum);
  }
}

