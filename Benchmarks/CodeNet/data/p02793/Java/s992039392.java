import java.util.*;
import java.io.*;
public class Main{
/// functions
static long gcd(long a,long b){if(b==0){return a;}return gcd(b,a%b);}
static long Modpow(long a,long p,long m){if(p==1){return a;}long x=Modpow(a,p/2,m);x=(x*x)%m;return (p&1l)!=0? (x*a)%m:x;}
static long Modmul(long a,long b,long m){return ((a%m)*(b%m))%m;}
static long ModInv(long a,long m){return Modpow(a,m-2,m);}
static long nck(int n,int r,long m){if(r>n){return 0l;}return Modmul(f[n],ModInv(Modmul(f[n-r],f[r],m),m),m);}
// end
static long[] f;

public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
       StringBuilder sb=new StringBuilder();
       BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
       int n=s.nextInt();
        int[] arr=new int[n];
        long mod=(long)1e9+7;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){arr[i]=s.nextInt();}
        	long res=0;
        for(int i=0;i<n;i++){
        	int tmp=arr[i];
        	for(int j=2;j*j<=arr[i];j++){
        		if(tmp%j==0){
        			int count=0;
        		while(tmp%j==0){count++;tmp/=j;}
        		map.put(j,Math.max(map.getOrDefault(j,0),count));
        		}
        	}
        	if(tmp!=1){map.put(tmp,Math.max(map.getOrDefault(tmp,0),1));}
        }
        long lcm=1;
        for(int x:map.keySet()){
        	lcm=Modmul(lcm,Modpow(x,map.get(x),mod),mod);
        }
        for(int i=0;i<n;i++){
        	res=(res+Modmul(lcm,ModInv(arr[i],mod),mod))%mod;
        }
       out.write(res+"");
        out.flush();
  }
}
