import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Long[] array = new Long[6];
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		long noko = k-a;
		noko=b-noko;

		if(a-k>=0) {
			System.out.println(a-k+" "+b);
		}

		else if(a+b-k>=0) {
			System.out.println(0+" "+noko);
		}

		else {
			System.out.println(0+" "+0);
		}
	}
}