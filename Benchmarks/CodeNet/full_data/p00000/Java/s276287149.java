import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.processingMultiplication();
		return;
	}
	
	//九九の計算
	private void processingMultiplication () {
		
		LinkedList<Integer> leftOperandList = new LinkedList<Integer>(); //左の被演算子のリスト
		LinkedList<Integer> rightOperandList = new LinkedList<Integer>(); //右の被演算子のリスト
		
		for (int i = 1; i < 10; i ++) {
			leftOperandList.add(i);
			rightOperandList.add(i);
		}
		
		int index = 0;
		
		for (int i = 0; i < 9; i ++) {
			
			int left = leftOperandList.get(i);
			
			for (int j = 0; j < 9; j++) {
				
				int answer = left * rightOperandList.get(j);
				index++;
				
				if (index < 9) {
					index = 0;
				}
				
				System.out.printf("%dx%d=%d\n", left, rightOperandList.get(j), answer);
			}
		}
		
	}
}