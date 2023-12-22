import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			String a = "";
			for (int i=1; i<n+1; i++) a += i;  //1からnまで入る文字列を作成
			permutation(a,"");
    	}
  }

    static void permutation( String input, String ans){
    	//1まで削ったらその回を終了して、答えを出力する
    	if (input.length() <= 1) {
    		System.out.println(ans + input);  //最後の数字はここでくっつく
    	} else {
    		for (int i=0; i<input.length(); i++) {  //inputの1、2、3…char目を分離して、残りの方に挿入する
    			permutation(input.substring(0, i) + input.substring(i + 1), ans + input.charAt(i) + " ");  //空白を入れる
    		}
    	}
    }
}

