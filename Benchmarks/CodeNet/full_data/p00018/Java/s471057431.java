import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[5];
		for(int i=0; i<5; i++){
			a[i] = stdIn.nextInt();
		}
		boolean jdg;
		do{
			jdg = true;
			for(int i=0; i<4; i++){
				if(a[i]<a[i+1]){
					int t = a[i];
					a[i] = a[i+1];
					a[i+1] = t;
					jdg = false;
				}
			}
		} while(jdg == false);
		
		for(int i=0; i<5; i++) System.out.print(a[i] + (i==4 ? "" : " "));
		
	}

}