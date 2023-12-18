import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ni = sc.nextInt();

		Set<Integer> set = new HashSet<Integer>();
		for (int i=0; i < ni; i++){
			int num = sc.nextInt();
			set.add(num);
		}
		int nj=0;
		Iterator<Integer> it = set.iterator();
		while (it.hasNext())
		{
			// System.out.println(it.next());
			it.next();
			nj++;
		}

		if (nj%2 == 0){
			System.out.println(nj/2);
		}else{
			System.out.println(0);
		}
		sc.close();
	}

}
