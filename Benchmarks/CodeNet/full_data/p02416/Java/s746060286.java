import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		//データの読み取りの準備
		Scanner sc = new Scanner(System.in);
		
		while(true){
			//データの読み取り
			String temp = sc.next();
			
			//終了条件の判定
			if(temp.equals("0")){
				break;
			}
			
			int result = 0;
			
			//tempをchar型の配列に変換
			char temp_2[] = temp.toCharArray();
			
			for(char c:temp_2){
				result += Character.getNumericValue(c);
			}
			
			System.out.println(result);
		}
	}
}
