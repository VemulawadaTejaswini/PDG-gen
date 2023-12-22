import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int [] a= {0,0,0,0,0,0,0};
	int [] b= {0,0,0,0,0,0,0};
	int[] c = {0,0,0,0,0,0,0};
	int A;

public void keisan(){
	for(A=0;A<=7;A++){
		a[A] =sc.nextInt();
		b[A] = sc.nextInt();
		c[A] =a[A]- b[A]; 
	}	
}
public void hyouzi(){
	for(A=0;A<=7;A++){
		System.out.println(c[A]);
	}
}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main gou = new Main();
		gou.keisan();
		gou.hyouzi();

	}

}