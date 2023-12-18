import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int k = sc.nextInt();

	  int[] array = new int[n];
	  for(int i = 0; i < k; i++){
	    int d = sc.nextInt();
	    for(int j = 0; j < d; j++){
	      array[sc.nextInt() - 1] = 1;
	    }
	  }

	  int count = 0;
	  for(int i = 0; i < n; i++){
	    if(array[i] != 1) count++;
	  }
	  System.out.print(count);
	}
}