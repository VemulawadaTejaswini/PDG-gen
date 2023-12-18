import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Atcoderくんとボール色塗り
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();//ボールの数
		int k=sc.nextInt();//色の数
		System.out.println(Math.pow((k-1),(n-1)));//K-1のｎ-1乗パターンがある。
	}
	//例）入力　10 8→　出力　9の7乗=322828856
}