import java.util.*;
import static java.lang.System.*;

public class Main{
	  static  long[] score;
	  static HashMap<String, List<Integer>> connect;
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);  
	  int N = sc.nextInt();
	  int Q = sc.nextInt();
	  score = new long[N+10];
	  connect = new HashMap<>();
	  String A,B;
	  //木構造を生成
	  for(int i=0; i<N-1; i++) {
		  int a = sc.nextInt();
		  int b = sc.nextInt();
		  A = String.valueOf(a);
		  B = String.valueOf(b);
		  if(!connect.containsKey(A))	{
			  List<Integer> list = new ArrayList<>();
			  list.add(b);
			  connect.put(A, list);
		  }  else {
			  List<Integer> list = connect.get(A);
			  list.add(b);
		  }
		  if(!connect.containsKey(B))	{
			  List<Integer> list = new ArrayList<>();
			  list.add(a);
			  connect.put(B, list);
		  }  else {
			  List<Integer> list = connect.get(A);
			  list.add(a);
		  }		  
	 }
	  
	  for(int i=0; i<Q; i++) {
		  int p = sc.nextInt();
		  int x = sc.nextInt();
		  score[p] += x;
	  }
	  
	  dfs(1,0);
	  
	  for(int i=1 ; i<= N; i++) {
		  out.print(score[i] + " ");
	  } 
	  
	}
     static void dfs(int number , int parent){
    	 score[number] += score[parent];
    	 List<Integer> list = connect.get(String.valueOf(number));
    	 	for(int i: list) {
    	 		if (i != parent) 
    	 		dfs(i, number);
    	 	}
    	 }
     }