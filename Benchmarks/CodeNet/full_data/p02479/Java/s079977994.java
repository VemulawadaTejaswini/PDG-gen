import java.util.Scanner;
public class Main {
public static void main(String[] args) {
// 標準入力からデータを読み込む準備
Scanner sc= new Scanner(System.in);
// 2つの文字の固まりをそれぞれ整数値と想定して読み込む
int r = sc.nextInt();
double area = r*r*3.141593;/* ここを変えて面積を求めよう*/
double length = r*2*3.141593;/* ここを変えて周囲の長さを求めよう*/
System.out.println(area + " " + length);
}
}