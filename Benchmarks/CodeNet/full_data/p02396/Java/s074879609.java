import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		List list = new ArrayList();
		int intSub = -1;
		boolean isZero = false;
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){

			intSub = scan.nextInt();
			if(intSub == 0){
				break;
			}else{
				list.add(intSub);
			}
		}
		for(int i = 0; i < list.size(); i++){
			System.out.println("Case " + (i + 1) + ": " + list.get(i));
		}

	}
}