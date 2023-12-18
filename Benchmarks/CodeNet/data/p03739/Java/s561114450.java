import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan =  new Scanner(System.in);

	int n = scan.nextInt();

	long[] a_ = new long[n];
	for(int i = 0; i < n; i++){
	    a_[i] = scan.nextLong();
	}

	long[] sum_ = new long[n];

	sum_[0] = a_[0];

	long count1 = 0;
	long count2 = 0;
	//sum_[0] >= 1
	if(sum_[0] < 1){
	    count1 = 1-sum_[0];
	}else{
	}
	for(int i = 1; i < n; i++){
	    sum_[i] = sum_[i-1]+a_[i];
	    if(i % 2 != 0){
		if(sum_[i] <= -1){
		    //OK
		}else{
		    count1 += sum_[i] + 1;
		    sum_[i] = -1;
		}
	    }else{
		if(sum_[i] >= 1){
		    //OK
		}else{
		    count1 += 1 - sum_[i];
		    sum_[i] = 1;
		}
	    }
	}
    
	
	//sum_[0] <= -1
	if(sum_[0] > -1){
	    count2 = sum_[0]+1;
	}else{
	}
	for(int i = 1; i < n; i++){
	    sum_[i] = sum_[i-1]+a_[i];
	    if(i % 2 != 0){
		if(sum_[i] >= 1){
		    //OK
		}else{
		    count2 += 1-sum_[i];
		    sum_[i] = 1;
		}
	    }else{
		if(sum_[i] <= -1){
		    //OK
		}else{
		    count2 += sum_[i]+1;
		    sum_[i] = -1;
		}
	    }
	}
    

	System.out.println(Math.min(count1, count2));
    }
}
