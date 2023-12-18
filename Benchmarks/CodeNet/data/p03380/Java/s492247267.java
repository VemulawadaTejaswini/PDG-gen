import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] a=new int[N];
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int n=a[a.length-1];
		int r;
		int right=0;
		int left=a.length-1;
		int mid=(right+left)/2;
		int m=n/2;
		while(true){
			if(a[right]<m && m<a[left-1]){
				if(m<a[mid]){
					left=mid+1;
					mid=(right+left)/2+1;
				}else{
					right=mid;
					mid=(right+left)/2+1;
				}
			}else{
				if(m<a[right]){
					r=a[right];
				}else{
					r=a[left-1];
				}
				break;
			}
			if(mid==right || mid==left){
				if(a[right]>n-a[left-1]){
					r=a[right];
				}else{
					r=a[left-1];
				}
				break;
			}
		}
		System.out.println(n+" "+r);
	}
}
