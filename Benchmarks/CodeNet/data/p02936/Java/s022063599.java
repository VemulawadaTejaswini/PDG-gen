import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    ArrayList<Node> list = new ArrayList<>();
    
    for(int i = 0; i < n-1; i++){
    	int a = sc.nextInt();
      	int b = sc.nextInt();
      	list.add(new Node(a-1, b-1));
    }
  	
    int[] v = new int[n];
    for(int i = 0; i < q; i++){
    	int a = sc.nextInt();
      	int b = sc.nextInt();
      	v[a-1] += b;
    }
    
    for(int i = 0; i < list.size(); i++){
      //System.out.println(list.get(i).key);	
      v[list.get(i).key] += v[list.get(i).parent];
    }
    
    
 
    for(int i = 0; i < v.length-1; i++){
    	System.out.print(v[i] + " ");
    }
    System.out.println(v[v.length-1]);
    
 
  }
}

class Node{
  public int parent;
  public int key;
	Node(int a, int b){
      this.parent = a;
      this.key = b;
    }
}