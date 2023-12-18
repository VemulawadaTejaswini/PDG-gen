import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	long[] height = new long[n];
	for(int i=0;i<n;i++){
	    height[i] = sc.nextLong();
	}
	HashSet<Integer> mt = new HashSet<Integer>();
	for(int i=0;i<m;i++){
	    int a = sc.nextInt()-1;
	    int b = sc.nextInt()-1;
	    if(!(height[a]==height[b])){
		if(height[a]>height[b]){
		    mt.add(a);
		    mt.remove(b);
		}else{
		    mt.add(b);
		    mt.remove(a);
		}
	    }else{
		System.out.println(mt.size());
		mt.remove(a);
		mt.remove(b);
	    }
	}
	System.out.println(mt.size());
      }
}
