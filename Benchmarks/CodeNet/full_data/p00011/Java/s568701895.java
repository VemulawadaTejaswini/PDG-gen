import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// 標準入力からデータを読み込む準備
	Scanner sc = new Scanner(System.in);
	int w = sc.nextInt();
	int n = sc.nextInt();
	int[] values = new int[w];
	for (int i = 0; i < values.length; i++) {
	    values[i] = i + 1;
	}
	for (int i = 0; i < n; i++) {
	    String str = sc.next();
	    String[] ab = str.split(",");
	    int a = Integer.parseInt(ab[0]) - 1;
	    int b = Integer.parseInt(ab[1]) - 1;
	    // aとbを使ってvaluesを操作しよう
	    int c;
	    c=a;
	    a=b;
	    b=c;
	}
	// valuesを出力しよう
	for (int k=0;k<n;k++){
	    System.out.println(values[k]);
	}
    }
}