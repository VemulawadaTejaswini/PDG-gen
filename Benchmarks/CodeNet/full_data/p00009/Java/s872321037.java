import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int MAX = 1000000;	
	int[] p = new int[MAX];
	for(int i=2; i<p.length; i++)p[i] = 1;
	for(int i=2; i<Math.sqrt(MAX)+1; i++){
	    for(int j=i*2; j<MAX; j+=i){
		p[j] = 0;
	    }
	}
	
	while(sc.hasNext()){
	    
	    int n = sc.nextInt();

	    int count = 0;
	    for(int i=0; i<=n; i++){
		if(p[i]==1)count++;
	    }

	    System.out.println(count);
	}
    }
}