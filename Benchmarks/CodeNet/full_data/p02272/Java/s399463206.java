import java.io.*;

public class Main {
	static int cnt=0;
	public static void Merge(int a[],int start,int end){
		if (start>=end) return;
		int center=(start+end)/2;
		Merge(a,start,center);
		Merge(a,center+1,end);
		int n1=center-start+1;
		int n2=end-center;
		int[] L=new int[n1];
		int[] R=new int[n2];
		for (int i=0;i<n1;i++){L[i]=a[start+i];}
		for (int i=0;i<n2;i++){R[i]=a[center+1+i];}
		int i=0; int j=0;
		for (int k=start;k<=end;k++){
			cnt++;
			if (i==n1) a[k]=R[j++];
			else if (j==n2) a[k]=L[i++];
			else if (L[i]<=R[j]) a[k]=L[i++];
			else a[k]=R[j++];
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] str=br.readLine().split(" ");
		int a[]=new int[n];
		for (int i=0;i<n;i++){
			a[i]=Integer.parseInt(str[i]);
		}
		Merge(a,0,n-1);
		for (int i=0;i<n;i++){
			System.out.print(a[i]);
			if (i<n-1) System.out.print(" ");
		}
		System.out.println();
		System.out.println(cnt);
	}
}