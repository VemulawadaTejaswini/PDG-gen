import java.util.Scanner;

class Main{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int ans,n;
    while(sc.hasNext()){
    	n=sc.nextInt();
    	ans=0;
    	if(n==1)ans=-1;
    	for(int i=1;i<=n;i+=2){
    		int flag=0;
    		for(int j=3;j<=Math.sqrt(i);j+=2){
    			if(i%j==0){
    				flag=1;break;
    			}
    		}
    		if(flag==0)ans++;
    	}
    	System.out.println(ans);
    }
    }
}