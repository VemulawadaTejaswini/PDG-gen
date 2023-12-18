import java.util.*;
public class Main{
static long[] aa;
  static long maxx(int[] arr,int ind,int k){
  	if(ind==arr.length-1){
    	return 0;
    }
    if(aa[ind]!=-1){return aa[ind];}
    long maxs=Integer.MAX_VALUE;
    for(int j=1;j<=k;j++){
      if(ind+j>=arr.length){break;}
    	maxs=(long)Math.min( maxs, maxx(arr,ind+j,k )+(long)Math.abs(arr[ind]-arr[ind+j] )  );
    }
    return aa[ind]=maxs;
  }
  
  public static void main(String[] args){
  
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    int[] arr=new int[n];
    for(int j=0;j<n;j++){
    	arr[j]=s.nextInt();
    }
    aa=new long[n];
    Arrays.fill(aa,-1);
    System.out.println(maxx(arr,0,k));
  
  }
  
}