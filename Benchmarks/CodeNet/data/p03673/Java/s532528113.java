import java.util.ArrayDeque;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt();
	  int[] a=new int[n];
	  for(int i=0;i<n;i++) a[i]=sc.nextInt();
	  ArrayDeque<Integer> dq = new ArrayDeque<>();
	  for(int i=0;i<n;i++) {
		  if(i%2==0) {
			  dq.addLast(a[i]);
		  }else {
			  dq.addFirst(a[i]);
		  }
	  }
	  if(n%2==0) {
		  for(int i=0;i<n-1;i++) {
			  System.out.print(dq.pollFirst()+" ");
		  }
		  System.out.println(dq.pollFirst());
	  }else {
		  for(int i=0;i<n-1;i++) {
			  System.out.print(dq.pollLast()+" ");
		  }
		  System.out.println(dq.pollLast());
	  }
  }
}

