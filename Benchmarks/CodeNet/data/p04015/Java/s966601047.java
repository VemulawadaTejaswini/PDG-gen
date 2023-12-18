import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


	static int ave;
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ave = in.nextInt();
        long ans = 0;
        
        int[] num = new int[n];
        
        for(int i=0;i<n;i++){
        	num[i]=in.nextInt();
        }
        
        ans = card_ave(num,0,0,0);
        
        System.out.println(ans);


        in.close();
    }

	private static long card_ave(int[] num, int i, int weight,int objective) {
		// TODO 自動生成されたメソッド・スタブ
		
		long ans = 0;
//		if(weight != 0) ans = weight==objective?1:0;
				
		if(i == num.length) return ans;
		
		ans += card_ave(num , i+1,weight + num[i], objective+ave); 
		ans += weight+num[i]==objective+ave?1:0;
		ans += card_ave(num , i+1,weight, objective);
		
		return ans;
	}
}
