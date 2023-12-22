import java.util.Scanner;
public class Main {
public static void main(String[] args) {
// 標準入力からデータを読み込む準備
Scanner sc = new Scanner(System.in);
// 要素数nを読み込み、配列にn個の整数を読み込む 
int n = sc.nextInt();
int i;
int[] a = new int[n];
for (i = 0; i < a.length; i++) {
a[i] = sc.nextInt(); }
// 以下で配列aの中身を逆順に表示しよう
// 改行なしで表示する時は System.out.print(表示する値) を使おう // 改行だけを表示する時は System.out.println() を使おう
for(i=0; i<a.length; i++){
	System.out.print(a[a.length-1-i]);
	if(i != a.length-1){
		System.out.print(" ");
	}
}
System.out.println();
sc.close();
}
}
