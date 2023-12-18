import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList> wholeGrid = new ArrayList<>();
		int rowNum = sc.nextInt();
		int columnNum = sc.nextInt();
		
		// 各行の文字列を1文字ずつ区切ったものを格納したArrayListをwholeGridに格納
		for(int i = 0; i < rowNum; i++) {
			String rowString = sc.next();
			ArrayList<String> row = new ArrayList<>();
			
			for(int n = 0; n < columnNum; n++) {
				row.add(rowString.substring(n,(n+1)));
			}
			
			wholeGrid.add(row);
		}
		
		// wholeGridから特定の文字を取り出して、その上下左右の文字との比較を繰り返す
		for(int i = 0; i < rowNum; i++) {
			for(int n = 0; n < columnNum; n++) {
				String paintInst = (String) wholeGrid.get(i).get(n);
				
				// 文字が"."ならそのままなのでcontinueでスキップ
				if(paintInst.equals(".")) {
					continue;
				}
				
				// 自分の右側と比べる
				if(n<(columnNum-1)) {
					if(paintInst.equals( (String) wholeGrid.get(i).get(n+1) ) ) {
						continue;
					}
				}
				
				// 自分の左側と比べる
				if(n>0) {
					if(paintInst.equals( (String) wholeGrid.get(i).get(n-1) ) ){
						continue;
					}
				}
				
				// 自分の上と比べる
				if(i>0) {
					if(paintInst.equals( (String) wholeGrid.get(i-1).get(n) ) ) {
						continue;
					}
				}
				
				// 自分の下と比べる
				if(i<(rowNum-1)) {
					if(paintInst.equals( (String) wholeGrid.get(i+1).get(n) ) ) {
						continue;
					}
				}
				
				// 上のどれにも引っかからない→上下左右に#が無いのでNoを表示して終了
				System.out.println("No");
				System.exit(0);
				
			}
		}
		
		// 終了することなくここまで来た→#の上下左右いずれかに#があるためYesを表示
		System.out.println("Yes");
	}
}