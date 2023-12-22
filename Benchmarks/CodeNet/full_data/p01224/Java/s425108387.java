import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			if(n == 1 || n == 2 || n == 3){
				System.out.println("deficient number");
				continue;
			}

			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(1);
			for(int i=2;i*i<=n;i++){
				if(n%i == 0){
					list.add(i);
					if(i != n/i){
						list.add(n/i);
					}
				}
			}

			int count=0;
			for(int i=0;i<list.size();i++){
				count += list.get(i);
			}

			if(count == n){
				System.out.println("perfect number");
			}else if(count < n){
				System.out.println("deficient number");
			}else{
				System.out.println("abundant number");
			}
		}
	}
}