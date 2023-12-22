import java.util.*;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m == 0 && n == 0) break;

			ArrayList<Integer> rem = new ArrayList<Integer>();
			for(int i=1;i<=m;i++) rem.add(i);

			int now = 0;
			for(int i=1;i<=n;i++){
				String s1 = "";
				if(i % 3 == 0) s1 += "Fizz";
				if(i % 5 == 0) s1 += "Buzz";
				if(i % 3 != 0 && i % 5 != 0) s1 += i;

				String s2 = sc.next();
				boolean flg = true; //true:¾¯Å\¬³ê½¶ñÅ é

				for(int j=0;j<s2.length();j++){
					if(s2.charAt(j) < '0' || '9' < s2.charAt(j)){
						flg = false;
					}
				}
				if(flg){
					s2 = new BigInteger(s2).toString();
				}

				if(!s1.equals(s2) && rem.size() > 1){
					rem.remove(now);
					now--;
				}

				now = (now + 1) % rem.size();
			}

			System.out.println(rem.toString().replaceAll("\\[|\\]|,",""));
		}
	}
}