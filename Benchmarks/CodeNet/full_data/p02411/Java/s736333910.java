import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int m;
		int f;
		int r;
		ArrayList<String> list = new ArrayList<String>();
		while(true){
			m = scan.nextInt();
			f = scan.nextInt();
			r = scan.nextInt();
			if(m == -1 && f == -1 && r == -1){
				break;
			}else if(m == -1 || f == -1){
				list.add("F");
			}else if(80 <= m + f){
				list.add("A");
			}else if(65 <= m + f){
				list.add("B");
			}else if(50 <= m + f){
				list.add("C");
			}else if(30 <= m + f){
				if(50 <= r){
					list.add("C");
				}else{
					list.add("D");
				}
			}else{
				list.add("F");
			}
		}
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}

		scan.close();
	}
}