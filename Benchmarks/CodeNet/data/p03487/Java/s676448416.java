import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Integer> l = new ArrayList<Integer>();

		for( int i = 0 ; i < n ; ++i){
			l.add(sc.nextInt());
		}

		l.sort(null);



		int anum = 0;
		int rnum = 0;
		int ans = 0;
		int sum = 0;
		int v =0;
		for(int i = 0 ; i < n ; ++i){

			if( i == 0 ){
				v = l.get(0);
			}

			if( v == l.get(i)){
				++rnum;
			}
			++anum;

			if(i+1 != n && v != l.get(i+1)){


				sum = sum + check(rnum , anum , v);
				v = l.get(i+1);
				rnum = 0;
			}else if( i + 1 ==n){
				sum = sum + (check(rnum , anum , v));
			}


		}

		System.out.println(sum);
	}

	static int check(int rnum , int anum , int v){
		if(rnum - v >= 0){
			return  rnum -v;
		}
		
		return anum;
	}


}
