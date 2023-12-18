import java.util.Arrays;
import java.util.Scanner;
public class Main
{
        public static void main(String args[]) throws Exception
        {
                Scanner cin=new Scanner(System.in);
                int n,midmid,ll,rr;
                long sum,l,r,mid,k;
                n=cin.nextInt();
                k=cin.nextInt();
                long arr[]=new long[n];
                for(int i=0; i<n; ++i) {
                	arr[i]=cin.nextLong();
                }
                Arrays.sort(arr);
                if(arr[0]<=0&&arr[n-1]<=0) {
                	l=arr[n-1]*arr[n-2];
                	r=arr[0]*arr[1];
                }
                else if(arr[0]>=0&&arr[n-1]>=0) {
                	l=arr[0]*arr[1];
                	r=arr[n-1]*arr[n-2];
                }
                else {
                	l=-1;r=1;
                	for(int i=0; i<18; ++i) {
                		l*=(long)10;
                		r*=(long)10;
                	}
                	--l;++r;
                	--l;++r;
                	--l;++r;
                }
                while(true) {
                	if(r-l<=1)
                		break;
                	mid=(l+r)/2;
                	sum=0;
                	for(int i=0; i<n; ++i) {
                		ll=i;
                		rr=n;
                		if(arr[i]<0){
                            while(rr-ll>1){
                                midmid=(ll+rr)/2;
                                if(arr[i]*arr[midmid]<=mid)
                                	rr=midmid;
                                else 
                                	ll=midmid;
                            }
                            sum=sum+(n-rr);
                        }
                		else {
                			while(rr-ll>1){
                                midmid=(ll+rr)/2;
                                if(arr[i]*arr[midmid]<=mid)
                                	ll=midmid;
                                else 
                                	rr=midmid;
                            }
                			sum=sum+(ll-i);
                		}
                	}
                	if(sum<k)
                		l=mid;
                	else
                		r=mid;
                }
                System.out.println(r);
                cin.close();
        }
}