import java.util.*;
import java.math.*;
 
public class Main {

		private static ArrayList<Long> ss = new ArrayList<>();
		private static ArrayList<Long> tt = new ArrayList<>();
		private static int ssCount=0;
		private static int ttCount=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int q = sc.nextInt();
		long[][] result = new long[a][b];
 
		for(int i=0;i<a;i++){
			ss.add(sc.nextLong());
		}
		for(int i=0;i<b;i++){
			tt.add(sc.nextLong());
		}
		ssCount = a;
		ttCount = b;


		for(int i=0;i<q;i++){
			long x = sc.nextLong();
			long jinja = findJinja(x);
			long tera = findTera(x);
			long total = calcResult(jinja,tera,x,result);
		}



	}
	private static long findJinja(long x){
		long near = 10000000000l;
		int position =0;

		for(int i=0;i<ss.size();i++){
			long distance = Math.abs(x-ss.get(i));
			if(distance<=near){
			near = distance;
			position = i;
			}
		}

		return ss.get(position);
	}

	private static long findTera(long x){
		long near = 10000000000l;
		int position =0;
		for(int i=0;i<tt.size();i++){
			long distance = Math.abs(x-tt.get(i));
			if(distance<=near){
			near = distance;
			position = i;
			}
		}
		return tt.get(position);
	}

	private static long calcResult(long jinja,long tera,long x,long[][] result){
		if((jinja< x && x <tera)
			||(tera< x && x <jinja)){
			long shorterDist = 
			Math.min(Math.abs(x-jinja),Math.abs(x-tera));

				System.out.println("shorterDist"+shorterDist);

			System.out.println(
				Math.abs(tera-jinja)+shorterDist);

		} else if((jinja< x && tera< x)){
			if(tera<jinja){
				System.out.println(x-tera);
			}else{
				System.out.println(x-jinja);
			}
		}else{
			if(tera<jinja){
				System.out.println(jinja-x);
			}else{
				System.out.println(tera-x);
			}
		}
		return 0;
	}

}
