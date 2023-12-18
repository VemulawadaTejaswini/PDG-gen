import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int num[] = new int[N];
		String bnum[] = new String[N];

		for(int n=0;n<N;n++){
			num[n] = sc.nextInt();
			bnum[n] = Integer.toBinaryString(num[n]);
		}

		int cnt = 0;
		String val,tmp;
		int i = 0,j = 0;
		
		while(true){
			cnt++;
			
			j = i+1;
			val = bnum[i];
			tmp = val;

			while(true){
				val = BinarySum(val,bnum[j]);
				if(val == null) break;

				cnt++;
				j++;
				tmp = val;
				if(j == N-1) break;
				
			}
			if(val == null){
			 val = tmp;
			 i++;
			}
			if(j == N-1){
			 i++;
			}

			if(i == N-2) break;
		}

		System.out.println(cnt);
		
	}

	private static String BinarySum(String s1,String s2){
		String st = "";

		if(s1.length() >= s2.length()){
			for(int n=0;n<s1.length()-s2.length();n++){
				st += s1.charAt(n);
			}
			for(int n=s1.length()-s2.length();n<s1.length();n++){
				if(s1.charAt(n) == '1' && s2.charAt(n-s1.length()+s2.length()) == '1') return null;
				if(s1.charAt(n) == '1' || s2.charAt(n-s1.length()+s2.length()) == '1') st += '1';
				else st += '0';
			}
			return st;
		}
		

		if(s1.length() < s2.length()){
			for(int n=0;n<s2.length()-s1.length();n++){
				st += s2.charAt(n);
			}
			for(int n=s2.length()-s1.length();n<s2.length();n++){
				if(s1.charAt(n-s2.length()+s1.length()) == '1' && s2.charAt(n) == '1') return null;
				if(s1.charAt(n-s2.length()+s1.length()) == '1' || s2.charAt(n) == '1') st += '1';
				else st += '0';
			}
		}
		return st;
	}
}