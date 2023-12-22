import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.next(); 							//アルファベットの入力
            if(s.equals("-")) {								//"-"のときfor文の後ろに移動する
            	break;
            }
            int m = sc.nextInt();							//シャッフル回数の入力
            for(int i = 0; i < m; i++){
                int h = sc.nextInt();						//取り出すカードの後ろからの枚数
                s = s.substring(h) + s.substring(0, h);		//指定した位置から最後まで切り取り、先頭にくっつける
            }
            System.out.println(s);
        }

    }
}
