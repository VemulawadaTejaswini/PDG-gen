import java.util.*;

class Main{

    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long[] a=new long[n];
	for(int i=0;i<n;i++){
	    a[i]=sc.nextLong();
	}

	long sum=0;
	for(int i=0;i<n;i++){
	    sum+=a[i];
	}

	long consume=n*(n+1)/2;
	if(sum%consume!=0){
	    System.out.println("NO");
	    return;
	}

	long sump=sum/consume;
	long cnt=0;
	boolean isok=true;
	for(int i=0;i<n;i++){
	    //a[i-1]+(sump-p)=a[i]+(n-1)*p
	    long chil=(a[(i-1+n)%n]+sump-a[i]);
	    if(chil<0 || chil%n!=0) isok=false;
	    long p=chil/n;
	    if(p<0 || p>sump) isok=false;
	    cnt+=p;
	}
	if(isok && cnt==sump){
	    System.out.println("YES");
	}
	else{
	    System.out.println("NO");
	}
	return;
    }
    

    
}
