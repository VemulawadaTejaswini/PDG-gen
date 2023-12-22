import java.util.*;
import java.lang.Math;
import java.math.BigInteger; 
public class Main{

	static int check(int x){
		String xx = String.valueOf(x);
		char k[] = xx.toCharArray();
		int flag = 1;
		for(int i = 1;i < xx.length();i ++){
			if(k[i] < k[i-1] || k[i] - k[i-1] != 1){flag = 0;break;}
		}
		if(flag == 0){return 0;}
		else {return 1;}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m[] = new int[n];
			for(int i = 0;i < n;i ++){
				m[i] = sc.nextInt();
			}
			int max = -1;
			for(int i = 0;i < n-1;i ++){
				for(int j = i+1;j < n;j ++){
					int t = m[i] * m[j];
					if(check(t) == 1 && t > max){max = t;}
				}
			}
			System.out.println(max);
		}
	}
}