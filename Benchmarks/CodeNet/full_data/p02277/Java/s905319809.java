import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Card[] A=new Card[n];

		for(int i=0;i<n;i++) {
			A[i]=new Card(in.next().charAt(0),Integer.parseInt(in.next()));
		}
		in.close();
		Card[] B=A.clone();
		quickSort(A,0,n-1);
		margeSort(B,0,n-1);

		PrintWriter out=new PrintWriter(System.out);
		int s=0;
		for(;s<A.length;s++) {
			if(A[s].s!=B[s].s)break;
		}
		out.println((s==A.length)? "Stable":"Not stable");
		//System.out.println(s);
		for(int i=0;i<n;i++) {
			out.println(A[i].s+" "+A[i].v);
		}
		out.flush();
	}
	
	static int partition(Card A[],int l,int r) {
		int i=l-1,j=l,x=A[r].v;
		Card t;
		
		for(;j<r;j++) {
			if(A[j].v<=x) {
				t=A[++i]; A[i]=A[j]; A[j]=t;
			}
		}
		t=A[++i]; A[i]=A[r]; A[r]=t;
		return i;
	}
	
	static void quickSort(Card A[],int l,int r) {
		if(l<r) {
			int m=partition(A,l,r);
			quickSort(A,l,m-1);
			quickSort(A,m,r);
		}
	}

	static void margeSort(Card A[],int left,int right) {
		int middle=left+((right-left+1)/2);
		if(left!=right) {
			margeSort(A,left,middle-1);
			margeSort(A,middle,right);
		}
		else return;

		int k=left,l=middle,cnt=0;
		Card B[]=new Card[right-left+1];
		while(k<middle && l<=right) {
			if(A[k].v<=A[l].v)B[cnt++]=A[k++];
			else B[cnt++]=A[l++];
		}

		while(k<middle) B[cnt++]=A[k++];
		while(l<=right) B[cnt++]=A[l++];

		for(int i=0;i<B.length;i++)A[left+i]=B[i];
	}

}

class Card{
	int v;
	char s;

	Card(char c,int v){
		s=c;
		this.v=v;
	}

	int getN(){
		return v;
	}
}



