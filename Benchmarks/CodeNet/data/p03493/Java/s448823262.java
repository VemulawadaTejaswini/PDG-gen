import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	int n;
	int a[] = new int[201];

	//最大操作回数を指定
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();

	//1回目に黒板に書かれる数字を指定
	for(int i = 0; i < n; i++){
	    a[i] = sc.nextInt();
	}

	int count = 0; //何回計算できるのか保持する変数
	
	//偶数かどうか判別する
	while(true){
	    //existOddをfalseで初期化し，
	    boolean existOdd = false;

	    //奇数でない(偶数である)場合はtrueを入れる
	    for(int i = 0; i < n; i++){
		if(a[i] % 2 != 0){
		    existOdd = true;
		}
	    }
	    //奇数があれば終了する
	    if(existOdd) break;
	    
	    //全て偶数の時，操作を行う
	    for(int i = 0; i < n; i++){
		a[i] /= 2;
	    }
	    //回数のカウント
	    count++;
	}
	//実行結果を表示する
	System.out.println(count);
    }
    
}


		
	    
	       
	
