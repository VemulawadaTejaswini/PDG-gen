import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		//System.out.println("??\???>>");

		Scanner scan = new Scanner(System.in);
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();



		while(scan.hasNext()){

			Integer ary[];
			ary = new Integer[2];
			ary[0] = scan.nextInt();
			ary[1] = scan.nextInt();

			if(ary[0] == 0 && ary[1] == 0 ){

				scan.close();
				break;
			}else{

				list.add(ary);
			}
		}

		for(int i = 0; i < list.size(); i++){

			Integer[] ary = list.get(i);

			if(ary[0] < ary[1]){

				System.out.println( ary[0] + " " + ary[1]);
			}else{

				System.out.println( ary[1] + " " + ary[0]);
			}

			//System.out.println("ary[0]:" + ary[0] + "ary[1]:" + ary[1]);
		}

	}

}