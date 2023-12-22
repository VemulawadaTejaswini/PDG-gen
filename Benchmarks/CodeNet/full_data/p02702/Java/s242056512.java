import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
        int cnts[] = new int[2019];
        int d = 1;
		int sum_of_digits=0;
      cnts[0]=1;
        for (int i=S.length()-1;i>=0;i--){
            sum_of_digits += Integer.parseInt(S.substring(i,i+1))*d;
            sum_of_digits%=2019;
            d*=10;
          	d%=2019;
            cnts[sum_of_digits]++;
     //     System.out.println(sum_of_digits);
        }
        int ans =0;
        for (int i=0;i < 2019;i++){
            ans += cnts[i]*(cnts[i]-1)/2;
        }
      System.out.println(ans);
            
    }

}

