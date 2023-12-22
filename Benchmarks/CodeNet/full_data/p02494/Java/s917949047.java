import java.util.Scanner;

public class Main {

public static void main(String[] args) {

// 標準入力からデータを読み込む準備

Scanner sc = new Scanner(System.in);

// 最初の文字の固まりを整数値と想定して読み込む
int x,y;

while (true) {

int H = sc.nextInt();

int W= sc.nextInt();

if (H == 0 && W == 0) {

break;

}
for(x=1;x<=H;x++){
	for(y=1;y<=W;y++){
		System.out.printf("#");
	}
	System.out.printf("\n");
}
// 二重ループ(forの中にfor)を書いて、H x W個の # を表示しよう!

}

}

}