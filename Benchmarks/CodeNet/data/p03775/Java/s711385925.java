import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		long n=scanner.nextLong();
		boolean flag = true;
		List<Long> list = new ArrayList<Long>();
		while(n % 2 == 0){
			n = n / 2;
			list.add((long) 2);
			flag = false;
		}

		for(int i = 3; i*i < n; i += 2){
			while(n % i == 0){
				n = n / i;
				list.add((long) i);
				flag = false;
			}
		}
		if(n > 1){
			list.add(n);
		}
		if(flag){
			list.add((long) 1);
		}

		list.sort(Comparator.reverseOrder());

		long l = list.get(0);
		long s = list.get(1);

		for(int i = 2; i < list.size(); i++){
			s = s * list.get(i);
			if(l < s){
				long temp = l;
				l = s;
				s = temp;
			}
		}

		if(l > s){
			System.out.println(String.valueOf(l).length());
		}else{
			System.out.println(String.valueOf(s).length());
		}
	}
}