package vol_0_3;

public class Main {

	public static void main(String[] args) {
		solve_0000();
	}

	public static void solve_0000(){
		for (int i = 1;i<10;i++){
			for(int j=1;j<10;j++){
				int answer = i*j;
				System.out.println(i+"x"+j+"="+ answer);
			}
		}
	}

}