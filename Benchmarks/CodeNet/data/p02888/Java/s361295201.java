import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n=sc.nextInt(),count=0;
    long[] l=new long[(int)n];
    for(int i=0;i<n;i++)l[i]=sc.nextInt();
    Arrays.sort(l);
    for(int i=0;i<n-2;i++) {
    	for(int j=i+1;j<n-1;j++) {
    		long buff=B_search(j+1,(int)(n-1),l,l[i]+l[j]);
			count+=Math.max(buff-j,0);
			//System.out.println("buff:"+buff+" l:"+(j+1)+" r:"+(n-1)+" v:"+(l[i]+l[j]));
    	}
    }
    System.out.println(count);
    //System.out.println(B_search(0,n-1,l,4));
  }
  //left,rightに検索範囲を入れる。aに検索したい配列を入れる。配列は単調増加のものに限る。vは閾値
	public static long B_search(int left,int right,long[] a,long v) {
		int num=(right+left)/2;
		if(a[right]<v) {
			return right;
		}
		if(a[left]>=v) {
			return -1;
		}
		if(a[num]<v) {
			return num;
		}else {
			return B_search(left,num,a,v);
		}
	}
}
