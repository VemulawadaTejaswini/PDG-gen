import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int H[] = new int[N];
    int A[] = new int[M];
    int B[] = new int[M];
    for(int i=0;i<N;i++) {
    	H[i] = sc.nextInt();
    }
    for(int i=0;i<M;i++) {
    	A[i] = sc.nextInt();
    	B[i] = sc.nextInt();
    }
    Set<Integer> Good = new HashSet<Integer>();
    Set<Integer> NotGood = new HashSet<Integer>();
    List<Integer> rem = new ArrayList<Integer>();
    for(int i=0;i<M;i++) {
    	if(H[A[i]-1]>H[B[i]-1]) {
    		Good.add(A[i]);
    		NotGood.add(B[i]);
    	}else {
    		Good.add(B[i]);
    		NotGood.add(A[i]);
    	}
    }
    for(int i=1;i<M;i++) {
    	if(!(Good.contains(i)&&NotGood.contains(i))) {
    		Good.add(i);
    	}
    }
    for(int g : Good) {
    	for(int ng : NotGood) {
    		if(g==ng) {
    			rem.add(g);
    		}
    	}
    }
    for(int i=0;i<rem.size();i++) {
    	Good.remove(rem.get(i));
    }
    System.out.println(Good.size());
  }
}