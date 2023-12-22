import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) throws IOException {
	  Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	  int m = in.nextInt();
	  HashMap<Integer,HashSet<Integer>> pass = new HashMap<Integer,HashSet<Integer>>();
	  int[] sign = new int[n];
	  sign[0]=0;
	  for(int i=0; i<m; i++) {
		  int a = in.nextInt();
		  int b = in.nextInt();
		  if(pass.containsKey(a)) {
			  pass.get(a).add(b);
		  }else {
			  HashSet<Integer> set = new HashSet<Integer>();
			  set.add(b);
			  pass.put(a,set);
		  }
		  if(pass.containsKey(b)) {
			  pass.get(b).add(a);			 
		  }else {
			  HashSet<Integer> set = new HashSet<Integer>();
			  set.add(a);
			  pass.put(b,set);
		  }
	  }
	  Queue<Integer> queue = new LinkedList<Integer>();
	  for(int i=2; i<=n; i++) {
		  if(!pass.containsKey(i)) {
			  System.out.println("No");
			  System.exit(0);
		  }
		  if(pass.get(i).contains(1)) {
			  sign[i-1]=1;
			  queue.add(i);
		  }
	  }
	  while(!queue.isEmpty()) {
		  int cur = queue.poll();
		  //System.out.println(cur);
		  for(int i=2; i<=n; i++) {
			  if(sign[i-1]==0 && pass.get(cur).contains(i)) {
				  sign[i-1]=cur;
				  queue.add(i);
			  }
		  }
	  }
	  for(int i=1; i<n; i++) {
		  if(sign[i]==0) {
			  System.out.println("No");
			  System.exit(0);
		  }
	  }
	  System.out.println("Yes");
	  for(int i=1; i<n; i++) {
		  System.out.println(sign[i]);
	  }
	  
  }
}