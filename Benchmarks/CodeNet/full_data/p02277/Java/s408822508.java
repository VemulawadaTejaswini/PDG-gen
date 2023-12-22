import java.util.Scanner;
public class Main{
    static int[]A;
    static String[]mark;
    static int[]num;
    public static void main(String args[]){
	int i,n,j;
	Scanner scat=new Scanner(System.in);
	n=scat.nextInt();
	A =new int[n];
	mark = new String[n];
	num=new int[n];
	for(i=0;i<n;i++){
	    mark[i]=scat.next();
	    A[i]=scat.nextInt();
	    num[i]=i;
	}
	quickSort(0,n-1);
	System.out.println(hantei());
	for(j=0;j<n;j++){
	    System.out.println(mark[j]+" "+A[j]);
	}
    }
    public static  void quickSort(int p,int r){
	int q;
	if(p<r){
	    q=partition(p,r);
	    quickSort(p,q-1);
	    quickSort(q+1,r);
    }
    }
	public static int partition(int p,int r){
	    int j,i,x;
	    int hz;
	    String hzs;
	x=A[r];
	i=p-1;
	for(j=p;j<r;j++){
	    if(A[j]<=x){
		i++;
		hz=A[i];
		A[i]=A[j];
		A[j]=hz;
		hz=num[i];
		num[i]=num[j];
		num[j]=hz;
		hzs=mark[i];
		mark[i]=mark[j];
		mark[j]=hzs;
		
	    }
	}
	hz=A[i+1];
	A[i+1]=A[r];
	A[r]=hz;
      	hz=num[i+1];
       	num[i+1]=num[r];
       	num[r]=hz;
	hzs=mark[i+1];
      	mark[i+1]=mark[r];
       	mark[r]=hzs;		
	return i+1;
	}
       static String hantei(){
       	int i;
	for(i=0;i<A.length-1;i++){
	 if(A[i]==A[i+1]){
		if(num[i]>num[i+1]){
		         return "Not stable";
		   }
				}
	}
		return "Stable";
       }	
}


