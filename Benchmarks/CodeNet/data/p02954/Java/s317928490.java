import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	public void solve() {
		
		Scanner sc = new Scanner(System.in);
		String sequence = sc.nextLine();
		sc.close();
		
		
		int rCount = 0;
		int lCount = 0;
		int[] childCntArr = new int[2];
		
		StringBuilder resultBuilder = new StringBuilder();
		
		int childCnt = 0;
		
		// 0 or 1 
		int rIndex = 0;
		// 0 or 1
		int lIndex = 0;
		
		char beforeChar = 'R';
		childCntArr[0] = 1;
		childCnt++;
		rCount++;
		
		for(int i = 1; i < sequence.length(); i++) {
			if(sequence.charAt(i) == 'R') {
				if(beforeChar == 'L') {
					
					resultBuilder.append(makeSubStr(rCount, lCount, childCntArr, rIndex, lIndex).toString());
					rCount = 1;
					lCount = 0;
					childCntArr[0] = 1;
					childCntArr[1] = 0;
					childCnt = 1;
					
				}else {
					
					rCount++;
					childCntArr[childCnt % 2]++;
					childCnt++;
					
				}
				beforeChar = 'R';
			}else if(sequence.charAt(i) == 'L') {
				if(beforeChar == 'R') {
					
					rIndex = (childCnt + 1) % 2;
					lIndex = childCnt % 2;
					childCntArr[childCnt % 2]++;
					childCnt++;
					lCount++;
					
				}else {
					
					childCntArr[childCnt % 2]++;
					childCnt++;
					lCount++;
					
				}
				beforeChar = 'L';
			}
		}
		
		resultBuilder.append(makeSubStr(rCount, lCount, childCntArr, rIndex, lIndex).toString());
		System.out.println(resultBuilder.substring(0, resultBuilder.length() - 1));
  	}
	
	public StringBuilder makeSubStr(int rCount, int lCount, int[] childCntArr, int rIndex, int lIndex) {
		
		StringBuilder retBuilder = new StringBuilder();
		for(int i = 0; i < rCount - 1; i++) {
			retBuilder.append("0 ");
		}
		retBuilder.append(childCntArr[rIndex]+" ");
		retBuilder.append(childCntArr[lIndex]+" ");
		for(int i = 0; i < lCount - 1; i++) {
			retBuilder.append("0 ");
		}
		
		//System.out.println(retBuilder.toString());
		return retBuilder;
		
	}
}
