import java.io.IOException;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int count=0;
		while(scan.hasNext()){	
			num= scan.nextInt();
			boolean[] prime = new boolean[num]; 
			for(int b=0;b<num;b++)
				prime[b]=true;
			if(num>1){
				prime[0]=false;
				//prime[1]=false;
			}else{
				System.out.println("0");
				continue;
			}
			for(int i=2;i<=Math.sqrt(num);i++){
				for(int j=2;j*i<=num;j++){
					if(prime[j*i-1])
						prime[i*j-1] = false;
				}
			}
		    for(int i=0;i<num;i++){
		    	if(prime[i]){
		    		//System.out.print((i+1)+" ");
		    		count++;
		    	}	
		    }
	        System.out.println(count);
			count=0;
		}
	}	
}