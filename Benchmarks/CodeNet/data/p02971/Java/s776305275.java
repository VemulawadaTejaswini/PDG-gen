import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
	
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int N=sc.nextInt();
	 int[] a=new int[N];
	 List<Integer> l=new ArrayList<Integer>();
	 for(int i=0;i<N;i++) {
		 Integer temp=sc.nextInt();
		 l.add(temp);
	 }
	 for(int i=0;i<N;i++) {
		 List<Integer> t=new ArrayList<Integer>(l);
		 t.remove(i);
		 Collections.sort(t);
		 System.out.println(t.get(N-2));
	 }

	 
	 
 }
	


}