import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int count = 0;
	if(N < 105){
	    count = 0;
	}else if(N == 105){
	    count = 1;
	}else if(N > 105){
	    count = 1;
	    for(int i=3;i<=N/i;i+=2){
		if(N%i==0){ //3.4個目あったら
		    for(int j=i+2;j<=N/j;j+=2){
			if(N%j==0){//5.6個目あったら
			    for(int k=j+2;k<=N/k;k+=2){
				if(N%k==0){//7.8個目あったら
				    count++;
				}
			    }
			}
		    }
		}
	    }
	}
	System.out.print(count);
    }
}
