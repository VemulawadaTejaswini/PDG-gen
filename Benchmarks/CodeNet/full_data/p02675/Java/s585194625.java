import java.util.*;
public class Main {
	public static void main(String[] args){
    //読み方を格納数r
    String yomi[] = {"hon","pon","bon"};
    int index = 0;
    //標準入力のインスタンス作成
		Scanner sc = new Scanner(System.in);
		// 整数Nの入力
		int N = sc.nextInt();
		// 出力
    int keta_1 = N%10;
    if ( keta_1 == 0 || keta_1==1 || keta_1==6 || keta_1==8 ){
      index=1;
    }else if( keta_1==3 ){
      index=2;
    }
		System.out.println(yomi[index]);
	}
}
