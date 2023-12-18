import java.util.*;
class Main{
	public static void main(String [] args){
    	Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	long mod = (long)(1e9)+7;
      	int freq[] = new int[n];
      	for(int i = 0; i< n ; i++){
        	freq[in.nextInt()]++;
        }
      	int chalu = n-1;
      	while(chalu>0){
          	if(freq[chalu]!=2){
            	System.out.println("0");
              	return;
            }
        	chalu-=2;
        }
      	long x = n/2;
      	System.out.println(power(2,x,mod));
    }
  	
    public static long power(long i,long j , long mod){
        if(j==0){
            return 1;
        }
        if(j%2==0)return (power(i,j/2,mod)%mod)*(power(i,j/2,mod)%mod);
        else return ((power(i,j/2,mod)%mod)*(power(i,j/2,mod)%mod)*i)%mod;
    }
}