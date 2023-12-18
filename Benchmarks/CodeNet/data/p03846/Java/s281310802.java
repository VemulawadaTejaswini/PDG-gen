import java.util.*;
class Main{
  static int freq[] = new int[100010];
  static long mod = (long)(1e9)+7;
  public static long solve(int n){
    long ans = 1;
  	if(n%2==1){
    	if(freq[0]!=1) return 0;
      	for(int i = 2; i < n ; i+=2){
          	//System.out.println(freq[i]);
        	if(freq[i]!=2)return 0;
          	ans = (ans*2)%mod;
        }
    }
    else{
    	for(int i = 1; i < n ; i+=2){
          	//System.out.println(freq[i]);
        	if(freq[i]!=2)return 0;
          	ans = (ans*2)%mod;
        }
    }
    return ans;
  }
	public static void main(String [] args){
    	Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	for(int i = 0; i< n ; i++){
        	freq[in.nextInt()]++;
        }
      	long ans = solve(n);
      	System.out.println(ans);
    }
  	
}