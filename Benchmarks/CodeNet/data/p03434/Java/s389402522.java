import java.util.Arrays;
import java.util.Scanner;

public class Main{
	  public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		  int N = sc.nextInt();
		  int[] lst = new int[N];
		  int alice_point = 0;
		  int bob_point = 0;

		  for(int i = 0; i < N; i++) {
			  lst[i] = sc.nextInt();
		  }

		  lst = sortDesc(lst);

		  for(int i = 0; i < N; i++) {
			  if(i % 2 == 0) {
				  alice_point += lst[i];
			  } else {
				  bob_point += lst[i];
			  }
		  }
		  System.out.println(alice_point - bob_point);
	  }

	  static int[] sortDesc(int[] lst) {
		  Arrays.sort(lst);

		  int[] lst_temp = new int[lst.length];

		  for(int i = 0; i < lst.length; i++) {
			  lst_temp[i] = lst[lst.length - 1 - i];
		  }

		  for(int i = 0; i < lst.length; i++) {
			  lst[i] = lst_temp[i];
		  }
		  return lst;
	  }
}