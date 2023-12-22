import java.util.*;
public class Main {
	public static void main(String[] args){
    
		Scanner sc = new Scanner(System.in);
		// 整数の入力
	
		// 文字列の入力
		String n = sc.next();
    
    /*--------------------------------*/
    //入力
    //String n = "123456789";
		String buf = "";

		//配列に格納
		int x = 0;
		for(int i= 0; i<n.length();i++){
		 buf=n.substring(i,i+1);
		 x += Integer.parseInt(buf);
		 //System.out.println(x);
		}

		//answer
		if(x%9 == 0){
			System.out.println("Yes");
		}else{
				System.out.println("No");
		}

	}
}

