import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.next();
		long k = sc.nextLong();

					// System.out.println("test"+s.substring(0,1));
			if(s.substring(0,1)=="1"){
				if(k==1){

					System.out.println("1");
				}else{
					System.out.println(s.substring(1,2));
				}
			}else{
		System.out.println(s.substring(0,1));
	}
	}
}