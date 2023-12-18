import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),count=0;
    int[] a=new int[n],b=new int[n],c=new int[n];
    for(int i=0;i<n;i++)a[i]=sc.nextInt();
    for(int i=0;i<n;i++)b[i]=sc.nextInt();
    for(int i=0;i<n;i++)c[i]=sc.nextInt();
    Arrays.sort(a);
    Arrays.sort(b);
    Arrays.sort(c);
    for(int i=0;i<n;i++) {
    	int lb=B_search(b,c[i]);
    	for(int j=0;j<lb;j++) {
    		count+=B_search(a,b[j]);
    	}
    }
    System.out.println(count);
  }
  //okはv以上の最小index、ngはv未満の最大index。aに検索対象の配列、vに検索値を入れる。
	public static int B_search(int[] a,int v) {
		int ng=-1,ok=a.length;

		while(Math.abs(ok-ng)>1) {
			int mid=(ok+ng)/2;

			if(a[mid]>=v) ok=mid;
			else ng=mid;
		}
		return ok;
	}
}
