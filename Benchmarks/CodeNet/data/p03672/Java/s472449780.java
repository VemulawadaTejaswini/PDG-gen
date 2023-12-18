import java.util.ArrayList;
import java.util.Scanner;

class Main{

	static int N;
	static int M;
	static 		ArrayList<ArrayList<Integer>> map;
	static boolean[] used;
	static int f = 0;
	static int s = 0;

	static int mindis = 1000000000;
	static ArrayList<Integer> saitan;




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		String x = sc.next();
		
		
		
		x = x.substring(0,x.length()-1);


		for(int i = 0;i < x.length();i++){
			if(x.length()%2 == 0){
				String f = x.substring(0, x.length()/2);		
				String b = x.substring(x.length()/2);



				for(int j = 0;j < f.length();j++){

					if(f.charAt(j) != b.charAt(j)){
						break;
					}else if(j == f.length()-1){
						System.out.println(f.length()*2);
						return;
					}
				}

				

			}
			x = x.substring(0,x.length()-1);


		}
	}

}


