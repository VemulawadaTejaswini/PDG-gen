import java.util.Scanner;
public class Main {
	public static void main(String args[]){//double 处理果盘
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(),num = 0;
		String alph = in.next();
		char[] al = alph.toCharArray();
		for (int i=0 ;i<n ;i++){
			if (i == 0) {
				++num;
			}else{
				if(al[i] != al[i-1]){
					++num;
				}
			}
		}
		System.out.println(num);
	}
}