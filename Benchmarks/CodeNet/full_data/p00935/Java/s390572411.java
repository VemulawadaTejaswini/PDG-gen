import java.util.*;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder build = new StringBuilder();
		for(int i = 0; i < N; i++){
			build.append(sc.nextInt());
		}
		
		for(int i = 0; i < 10000; i++){
			if(build.indexOf(Integer.toString(i)) == -1){
				System.out.println(i);
				break;
			}
		}
	}

}