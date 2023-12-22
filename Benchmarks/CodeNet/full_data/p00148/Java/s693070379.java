import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int cand = sc.nextInt();
			int no = cand % 39;
			if(no == 0) no = 39;
			if(no < 10){
				System.out.println("3C0"+no);
			}else {
				System.out.println("3C"+no);
			}
		}
		sc.close();
	}
}