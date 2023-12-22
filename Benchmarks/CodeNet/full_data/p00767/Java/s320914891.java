import java.util.Scanner;

public class Main {
    static final int MAX_LENGTH = 150; // 幅と高さの上限

    public static void main(String[] args) {
	final int MAX_LENGTH = 150;
	Scanner sc = new Scanner(System.in);
	while (true) {
	    int h = sc.nextInt();
	    int w = sc.nextInt();
	    if (h == 0) {
		break;
	    }
	    
	    int diagonal = diagSquare(h, w); // 入力した長方形の対角線の長さの2乗
	    
	    // 方法1. 素直に総当たりする
	    all(h, w, diagonal);
	}
    }
    
    public static int diagSquare(int h, int w) {
	return h * h + w * w;
    }
    
    public static void all(int h, int w, int diagonal) {
	// iは高さ、jは幅
	int resultH = 0;
	int resultW = 0;
	int resultD = Integer.MAX_VALUE;
	
	// iは高さ、jは幅
	for (int i = 1; i <= MAX_LENGTH; i++) {
	    for (int j = i + 1; j <= MAX_LENGTH; j++) {
		int diagonalT = diagSquare(i, j);
		// データセットより大きい長方形のみ対象
		if (diagonal < diagonalT || diagonal == diagonalT && h < i) {
		    if (diagonalT < resultD || diagonalT == resultD && i < resultH) {
			resultH = i;
			resultW = j;
			resultD = diagonalT;
		    }
		}
	    }
	}
	System.out.println(resultH + " " + resultW);
    }
}