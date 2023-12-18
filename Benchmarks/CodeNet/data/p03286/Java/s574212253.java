import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		if(n<0){
			sum = -n;
			c=0;
			for(int i=0;i<100;i++){
				if(sum!=0){sum=%2;c++;}
				else break;
			}
			}
		String bin = Integer.toBinaryString(n);
		bin.substring(c);
		System.out.println(bin);
		
	}
}