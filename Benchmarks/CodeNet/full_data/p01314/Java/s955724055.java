import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
    	new Main(); 
    }
 
    public Main() {
    	new A().doIt();
    }
    class A{
    	int cnt[] = new int [1001]; 
    	void check(int num,int sum){
    		if(sum > 1000)return;
    		else{
    			cnt[sum]++;
    			check(num+1,sum + num);
    		}
    	}
    	void doIt(){
    		for(int i = 1;i <= 1000;i++){
    			cnt[i]--;
        		check(i+1,i);
        	}
    		while(true){
    			int n = sc.nextInt();
    			if(n == 0)break;
    			System.out.println(cnt[n]);
    		}
    	}
    }
}