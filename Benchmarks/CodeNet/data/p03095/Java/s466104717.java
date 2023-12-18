import java.util.Arrays;
import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
			// 整数の入力
			long ptn = 0;
			int N = Integer.parseInt(sc.next());
			char[] c = sc.next().toCharArray();
			Arrays.sort(c);
			
			char flag = c[0];
			long tmp_ptn = 0;
			for(int i=0; i<N; i++){
				if(flag!=c[i]){
					tmp_ptn = ptn;
					flag = c[i];
					ptn = ptn*2 + 1;
				}else{
					ptn = ptn + tmp_ptn + 1;
				}
			}
			
		
			System.out.println(ptn%1000000007);
		
		sc.close();
	}
	

	
}
