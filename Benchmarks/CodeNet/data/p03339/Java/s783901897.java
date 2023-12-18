import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

	int N= sc.nextInt();
	String S= sc.next();
	int WE[]=new int[N];
	int sum[]=new int[N];
	int sump=0;
	for(int i=0;i<N;i++){
	    if(S.charAt(i)=='E'){
	        WE[i]=0;
	    }else{	
	        WE[i]=1;
	    }
	    sump=sump+WE[i];
	    sum[i]=sump;
	}
	    
	int min=(N-1)-(sum[N-1]-sum[0]);
	for(int i=1;i<N;i++){
	 if(min>sum[i-1]+(N-(i+1))-(sum[N-1]-sum[i])){
	     min=sum[i-1]+(N-(i+1))-(sum[N-1]-sum[i]);
	 }
	    
	}    

	System.out.println(min);

	    
	}

}
