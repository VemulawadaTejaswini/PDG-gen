import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
 
 
public class Main {
 
	public static void main(String[] args) {
 
		Solve s= new Solve();
		s.solve();
 
	}
}
 
 
class Solve{
 
 
	 public void solve() {
		 Scanner sc = new Scanner(System.in) ;
		 int N = sc.nextInt();
		 int K = sc.nextInt();
		 int[] a = new int[N];
		 int res =0;
		 
 
		 
		 for(int i=0;i<N;i++) {
			 a[i]=sc.nextInt();
		 }
		 
		 for(int l=0;l<=K;l++) {
			 for(int r=0;r<=K-l;r++) {
				 
				 if(l+r>N) {
					 continue;
				 }
				 ArrayList<Integer> now = new ArrayList<>();
				 int d=K-l-r;
				 int score=0;
				 for(int i=0;i<l;i++) {
					 score+=a[i];
					 now.add(a[i]);
				 }
				 for(int i =N-r;i<N;i++) {
					 score+=a[i];
					 now.add(a[i]);
				 }
				// Collections.sort(now);
				 
				 for(int i=0;i<=d;i++) {
					 if(i>=now.size())break;
					 if(now.get(i)>0)break;
					 score-=now.get(i);
				 }
				 
					 res=Math.max(res, score);
					 
				 
			 }
			 
		 }
		 System.out.println(res);
 
		
	 }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {

		Solve s= new Solve();
		s.solve();

	}
}


class Solve{


	 public void solve() {
		 Scanner sc = new Scanner(System.in) ;
		 int N = sc.nextInt();
		 int K = sc.nextInt();
		 int[] a = new int[N];
		 int res =0;
		 

		 
		 for(int i=0;i<N;i++) {
			 a[i]=sc.nextInt();
		 }
		 
		 for(int l=0;l<=K;l++) {
			 for(int r=0;r<K-l;r++) {
				 
				 if(l+r>N) {
					 continue;
				 }
				 ArrayList<Integer> now = new ArrayList<>();
				 int d=K-l-r;
				 int score=0;
				 for(int i=0;i<l;i++) {
					 score+=a[i];
					 now.add(a[i]);
				 }
				 for(int i =N-r;i<N;i++) {
					 score+=a[i];
					 now.add(a[i]);
				 }
				// Collections.sort(now);
				 
				 for(int i=0;i<d;i++) {
					 if(i>=now.size())break;
					 if(now.get(i)>0)break;
					 score-=now.get(i);
				 }
				 
					 res=Math.max(res, score);
					 
				 
			 }
			 
		 }
		 System.out.println(res);

		
	 }
}