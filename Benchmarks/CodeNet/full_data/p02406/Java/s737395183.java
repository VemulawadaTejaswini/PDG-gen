import java.util.Scanner;

class Main {

	private int i = 1;
	private int x;
	public int num;

	public void CHECK_NUM(){
		x = i;
		if(x % 3 == 0){
			System.out.print(" " + i);
			END_CHECK_NUM();
		}else{
			INCLUDE3();
		}
	}
	public void INCLUDE3(){
		if(x % 10 == 3){
			System.out.print(" " + i);
			END_CHECK_NUM();
		}else{
			x /= 10;
			if(x != 0){
				INCLUDE3();
			}
			END_CHECK_NUM();
		}
	}
	public void END_CHECK_NUM(){
		if(++i <= num){
			CHECK_NUM();
		}
	}

	public static void main(String[] args) {

		Main cpro = new Main();
		Scanner scan = new Scanner(System.in);
		cpro.num = scan.nextInt();
		scan.close();
		cpro.CHECK_NUM();

		System.out.print("\n");
	}

}