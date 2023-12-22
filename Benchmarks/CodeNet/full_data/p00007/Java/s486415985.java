import java.util.*;
public class Main{
	static final long price = 100000;
    static final double k = 0.05;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        double temp;
        long ans;
        
        n = sc.nextInt();
        temp = (double)price;
        for(int i=0;i<=n;i++){
	      	temp = temp+(price*k);
		    if(temp%1000>1){
		    	temp /= 1000;
		    	temp *= 1000;
		    	temp += 1000;
		    }
		    else{
		    	temp /= 1000;
		    	temp *= 1000;
		    }
        }
        
        ans = (int)temp;
        
        if(ans%1000>1){
        	ans /= 1000;
        	ans *= 1000;
        	ans += 1000;
        }
        else{
        	ans /= 1000;
        	ans *= 1000;
        }
        
        System.out.println(ans);
    }
}