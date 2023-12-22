import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] line=sc.nextLine().split(" ");
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(line[i]);
		}
		for(int i=0;i<n;i++){
			int v=a[i];
			int j=i-1;
			while(j>=0 && a[j]>v){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=v;
			for(int k=0;k<n-1;k++){
				System.out.print(a[k]+" ");
			}
			System.out.println(a[n-1]);
		}
	}
}
