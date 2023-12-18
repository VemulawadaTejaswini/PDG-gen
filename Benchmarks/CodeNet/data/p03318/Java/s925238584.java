import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		String str = String.valueOf(N);
		int K = 0;

		for(int i = 0; i < str.length(); i++){
			K += Integer.parseInt(str.substring(i, i+1));
		}

		if(K == N) K++;
		String tmp = String.valueOf(K);
		int level = tmp.length();
		for(long i = 0; i < N;i++){
			System.out.println(tmp);
			if(Integer.parseInt(tmp.substring(level-1,level)) != 9){
				if(level != tmp.length()){
				tmp = tmp.substring(0,level-1) + String.valueOf((Integer.parseInt(tmp.substring(level-1,level))+1))
					  + tmp.substring(level,tmp.length());
				}else{
					tmp = tmp.substring(0,level-1) + String.valueOf((Integer.parseInt(tmp.substring(level-1,level))+1));
				}
			}else{
				tmp = "1" + tmp;
			}
		}
	}
}
