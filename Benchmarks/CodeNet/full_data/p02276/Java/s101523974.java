import java.util.Scanner;
public class Main{
    public static void main(String args[]){
	int i,n,j,p,r,hz,x;
	Scanner scat=new Scanner(System.in);
	n=scat.nextInt();
	int A[]=new int[n];
	for(i=0;i<n;i++){
	    A[i]=scat.nextInt();
	}
	p=0;
	r=n-1;
	x=A[r];
	i=p-1;
	for(j=p;j<r;j++){
	    if(A[j]<=x){
		i++;
		hz=A[i];
		A[i]=A[j];
		A[j]=hz;
	    }
	}
	hz=A[i+1];
	A[i+1]=A[r];
	A[r]=hz;
	for(j=0;j<n;j++){
	    if(j!=0) System.out.print(" ");
	    if(j!=i+1){
		System.out.print(A[j]);
	    }else{
		System.out.print("["+A[j]+"]");
	    }
	}
	System.out.println("");
    }
}

