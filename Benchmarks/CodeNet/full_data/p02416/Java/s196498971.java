import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> x =new ArrayList<Integer>();
		String str=" ";

	for(int h=0 ;; h++){
		str=scan.next();
		if(str.equals("0"))break;
		char[] chr= str.toCharArray();
		x.add(h,0);
		for(int i=0;i<chr.length;i++){
			x.set(h,x.get(h)+Integer.parseInt(String.valueOf(chr[i])));
		}
	}

		for(int data:x){
			System.out.println(data);
		}

	}

	}