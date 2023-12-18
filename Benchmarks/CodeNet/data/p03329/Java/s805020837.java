import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);
    	int N=sc.nextInt();

    	int sum=0;

    	List<Integer> data=new ArrayList<Integer>();

    	int result=1;

    	data.add(result);

    	while(true) {

    		if(N>=result*9) {
    			result*=9;
    			data.add(result);
    		}else {
    			break;
    		}

    	}

    	result=1;

    	while(true) {

    		if(N>=result*6) {
    			result*=6;
    			data.add(result);
    		}else {
    			break;
    		}

    	}

    	Collections.sort(data);



    	int[] dp=new int[N+1];

    	Arrays.fill(dp,99999999);
    	dp[0]=0;

    	for(Integer I:data) {
    		for(int j=0;j<=N;j++) {

    			if(j-I>=0) {
    				dp[j]=Math.min(dp[j],dp[j-I]+1);
    			}
    		}
    	}


    	System.out.println(dp[N]);


    }


}

