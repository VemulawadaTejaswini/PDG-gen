import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	String str;
	  	String con[] =  new String[1000];
	  	int sumbox[] = new int[1000];
	  	int num = 0;
	  	int sum;
	  	int dig;
		boolean end = false;
		int count = 0;
		
		//初期化
		for(int i = 0; i < 1000 ;i ++) {
	  		con[i] = "";
		}
		
		while( !end  ){
			str = scanner.nextLine();
			count = str.length();		//文字数取得
			sum = 0;
			for(int i = 0; i < 1000 ;i ++) {
		  		sumbox[i] = 0;
			}
			
			//文字列を1文字ずつの数字に
			for(int i = 0; i < count ;i ++) {
		  			con[i] = str.substring(i,i + 1);
		  			sumbox[i] = Short.parseShort(con[i]);
			}
			
			//終了判定したい場所
			if( sumbox[0] == 0 ){
				end = true;
				break;
			}
			//各桁を足す処理
			for(int i = 0; i < count ;i ++) {
		  			sum += sumbox[i];
			}
			//出力
			System.out.println(sum);
		}
		scanner.close();
  }
}
