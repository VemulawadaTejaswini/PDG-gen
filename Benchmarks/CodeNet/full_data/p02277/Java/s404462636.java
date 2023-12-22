import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		List<Card> Am=new ArrayList<>(),Aq=new ArrayList<>();
		for(int i=0;i<n;i++) {
			Card c=new Card();
			c.symbol=in.next().charAt(0); c.num=Integer.parseInt(in.next());
			Am.add(c); Aq.add(c);
		}
		
		Am=mergeSort(Am);
		quickSort(Aq, 0, n-1);
		
		boolean chk=true;
		for(int i=0;i<n;i++) {
			if(Am.get(i).symbol != Aq.get(i).symbol) {
				chk=false;
				break;
			}
		}
		
		PrintWriter out=new PrintWriter(System.out);
		if(chk)out.println("Stable");
		else out.println("Not stable");
		
		for(int i=0;i<n;i++) {
			Card c=Aq.get(i);
			out.println(c.symbol+" "+c.num);
		}
		out.flush();
	}
	
	static List<Card> mergeSort(List<Card> A){
		int size=A.size();
		if(size==1)return A;
		
		int mid=size/2;
		Queue<Card> l=new ArrayDeque<>(mergeSort(A.subList(0, mid)));
		Queue<Card> r=new ArrayDeque<>(mergeSort(A.subList(mid, size)));
		return merge(l, r);
	}
	
	static List<Card> merge(Queue<Card> A, Queue<Card> B){
		
		List<Card> C=new ArrayList<>();
		
		while(!A.isEmpty() && !B.isEmpty()) {
			
			int a=A.element().num,b=B.element().num;
			
			if(a<b) C.add(A.remove());
			else if(a>b) C.add(B.remove());
			else {
				C.add(A.remove()); C.add(B.remove());
			}
		}
		
		if(A.isEmpty()) while(!B.isEmpty())C.add(B.remove());
		else while(!A.isEmpty()) C.add(A.remove());
		
		return C;
		
	}
	
	static void quickSort(List<Card> A, int p, int r){
		if(p<r) {
			int q=partition(A, p, r);
			quickSort(A, p, q-1);
			quickSort(A, q+1, r);
		}
	}
	
	static int partition(List<Card> A, int p, int r) {
		
		int x=A.get(r).num,i=p-1;
		
		for(int j=p;j<r;j++) {
			if(A.get(j).num<=x) {
				i++;
				Collections.swap(A, i, j);
			}
		}
		i++;
		Collections.swap(A, i, r);
		return i;
	}

}

class Card{
	char symbol=0;
	int num=0;
}

