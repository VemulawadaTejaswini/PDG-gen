import java.util.*;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] data = new int[10];
		int i,k;
		int minidx, work;
		Scanner sc = new Scanner(System.in);
		for(i=0; i<3; i++){
			data[i] = sc.nextInt();
		}
		for(i=0; i<3; i++){
			minidx = i;
			for(k=i; k<3; k++){
				if(data[k] < data[minidx]){
					minidx = k;
				}
			}
			work = data[i];
			data[i] = data[minidx];
			data[minidx] = work;
		}
		for(i=0; i<3; i++){
			if(i>0){
				System.out.print(" ");
			}
			System.out.print(data[i]);
		}
		System.out.println("");

	}

}