import java.util.*;
public class Main{
    static boolean judge(int minute,int K){
	if(minute<K+1){
	    return true;
	}else{
	    return false;
	}
    }

    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int ans =0;
	int minute=0;
	boolean flag = true;
	int lastminute=0;
	
	int N=sc.nextInt();
	int M=sc.nextInt();
	int K=sc.nextInt();

	int A[]= new int[N];
	int B[]= new int[M];
	
	for(int i=0; i<N; i++){
	    A[i]= sc.nextInt();
	}
	for(int i=0; i<M; i++){
	    B[i]=sc.nextInt();
	}
	int front_A=0;
	int front_B=0;

	while(judge(minute,K)){
	    
	    if(front_A!=N && front_B!=M){
		if(A[front_A]<=B[front_B]){
	    
		    minute=minute+A[front_A];
		    lastminute=A[front_A];
		    ans++;

		    front_A++;
		}else{
		    minute=minute+B[front_B];
		    lastminute=B[front_B];
		    ans++;

		    front_B++;
		}
	    }else if(front_A==N &&front_B!=M){
		for(int i=front_B; i<M; i++){
		    minute =minute +B[i];
		    lastminute=B[front_B];
		    front_B++;
		    ans++;

		}
	    }else if(front_B==M &&front_A !=N){
		for(int i=front_A; i<N; i++){
		    minute =minute +A[i];
		    lastminute=A[front_A];
		    front_A++;
		    ans++;

		}
	    }else{
		break;
	    }
	}
	if(!judge(minute,K)){
	    minute=minute-lastminute;
	    ans=ans-1;
	}
	System.out.println(ans);
    }
}

