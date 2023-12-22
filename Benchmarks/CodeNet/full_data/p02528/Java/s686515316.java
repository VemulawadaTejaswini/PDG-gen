//\[g·évOiÌlÍ1000Èºj
import java.util.*;

public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] num = new int[n];
		for(int i=0; i < n; i++){
			num[i] = sc.nextInt();
		}
		chiintaiInsertSort(num);
		for(int i=0; i < n- 1; i++){
			System.out.print(num[i] + " ");
		}
		System.out.println(num[n-1]);
	}

	private int[] chiintaiInsertSort(int[] array){
		int len = array.length;
		for (int i = 1;i<len;i++){
			int insertNum = array[i];
			int j;
			for(j = i;j >= 1; j--){
				if(array[j-1] < insertNum){
					break;
				}
				array[j] = array[j-1];
			}
			array[j] = insertNum;

		}
		return array;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}