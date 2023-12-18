

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int colomn = sc.nextInt();
		int target = sc.nextInt();
		int[][] originalTable = new int[row][colomn];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < colomn; j++) {
				originalTable[i][j] = 0;
			}
		}
		String answer = "No";
		outside: for(int changeRowNum = 0; changeRowNum <= row; changeRowNum++) {
			for(int changeColumnNum = 0; changeColumnNum <= colomn; changeColumnNum++) {
				int[][] table = originalTable;
				int rowNum = 0;
				int columnNum = 0;
				while(rowNum < changeRowNum || columnNum < changeColumnNum) {
					if(rowNum < changeRowNum) {
						table = pushButton(true, rowNum, table);
						rowNum++;
					}
					if(columnNum < changeColumnNum) {
						table = pushButton(false, columnNum, table);
						columnNum++;
					}
				}
				int count = 0;
				for(int[] i: table) {
					for(int j: i) {
						if(j == 1) {
							count++;
						}
					}
				}
				if(count == target) {
					answer = "Yes";
					break outside;
				}
			}
		}
		System.out.println(answer);

	}
	public static int[][] pushButton(boolean isRow, int buttonNo, int[][] originalTable) {
		int rowNo = originalTable.length;
		int columnNo = originalTable[0].length;
		int[][] table = new int[rowNo][columnNo];
		for(int i = 0; i < rowNo; i++) {
			for(int j = 0; j < columnNo; j++) {
				table[i][j] = originalTable[i][j];
			}
		}
		if(isRow) {
			for(int i = 0; i < columnNo; i++) {
				table[buttonNo][i] = change0_1(table[buttonNo][i]);
			}
		} else {
			for(int i = 0; i < rowNo; i++) {
				table[i][buttonNo] = change0_1(table[i][buttonNo]);
			}
		}
		return table;
	}
	public static int change0_1(int num) {
		if(num == 0) {
			num = 1;
		} else {
			num = 0;
		}
		return num;
	}

}
