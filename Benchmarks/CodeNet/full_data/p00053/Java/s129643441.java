import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int MAX = 10001;
	int[] p = new int[MAX];
	for(int i=2; i<p.length; i++)p[i] = 1;
	for(int i=2; i<Math.sqrt(MAX)+1; i++){
	    for(int j=i*2; j<MAX; j+=i){
		p[j] = 0;
	    }
	}

	int n = sc.nextInt();

	while(n!=0){
	    int count = 0;
	    int s = 0;
	    for(int i=0; i<MAX; i++){
		if(p[i]==1){
		    s += i;
		    count++;
		}
		if(count==n){break;}
	    }

	    System.out.println(s);

	    n = sc.nextInt();
	}
    }
}