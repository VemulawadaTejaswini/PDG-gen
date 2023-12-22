import java.util.Scanner;
public class Main{
static int cnt=0;
static long SENTINEL=1000000001l;
static long []s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i;
     Scanner yomi=new Scanner(System.in);
     s=new long[yomi.nextInt()];
     for(i=0;i<s.length;i++) s[i]=yomi.nextLong();
     mergesort(s,0,s.length);
     for(i=0;i<s.length;i++){
    	 if(i!=s.length-1){
    	 System.out.print(s[i]+" ");
    	 }else{
         System.out.println(s[i]);
    	 }
     }
     System.out.println(cnt);
	}
public static void merge(long[] a,int left,int mid,int right){
	  int n1=mid-left,n2=right-mid,i,j,k;
	  long l[]=new long[n1+1];
	  long r[]= new long[n2+1];
	  for(i=0;i<n1;i++){
		  l[i]=a[left+i];
	  }
	  for(i=0;i<n2;i++){
		  r[i]=a[mid+i];
	  }
	  l[n1]=SENTINEL;
	  r[n2]=SENTINEL;
	  i=0;
	  j=0;
	  for(k=left;k<right;k++){
		  cnt++;
		  if(l[i]<=r[j]){
			  s[k]=l[i];
			  i++;
		  }else{
			  s[k]=r[j];
			  j++;
		  }
	  }
  }
  public static void mergesort(long[]a,int left,int right){
	  int mid;
	  if(left+1<right){
	  mid=(left + right)/2;
	  mergesort(a,left,mid);
	  mergesort(a,mid,right);
	  merge(a,left,mid,right);
	
	  }
  }

}
