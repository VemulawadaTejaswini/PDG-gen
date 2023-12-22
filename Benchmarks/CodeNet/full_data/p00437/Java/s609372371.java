import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		List<Integer[]> check = new ArrayList<Integer[]>();
		int[] ABC;
		int A;
		int B;
		int C;
		int n;
		try{
			scan = new Scanner(new InputStreamReader(System.in));
			A = scan.nextInt();
			B = scan.nextInt();
			C = scan.nextInt();
			n = scan.nextInt();
			while(true){
				Integer[] abc = new Integer[4];
				boolean bl = true;
				for(int i = 0 ; i < 3;i++){
					abc[i] = scan.nextInt();
					if(abc[i] !=0)bl = false;
				}
				if(bl)break;
				abc[3] = scan.nextInt();
				check.add(abc);
			}
		}finally{
			if(scan !=null)scan.close();
		}
		ABC = new int[A + B + C];
		for(int i = 0; i < ABC.length;i++){
			ABC[i] = 2;
		}
		Iterator<Integer[]> it = check.iterator();
		while(it.hasNext()){
			Integer[] abc =it.next();
			if(abc[3] == 1){
				it.remove();
				for(int i = 0 ; i < 3;i++){
					ABC[abc[i] - 1] = 1;
				}
			}
		}
		it = check.iterator();
		while(it.hasNext()){
			Integer[] abc =it.next();
			int a = ABC[abc[0] -1];
			int b = ABC[abc[1] -1];
			int c = ABC[abc[2] -1];
			if(a == 1 && b == 1)
				ABC[abc[2] -1] = 0;
			else if(b == 1 && c == 1)
				ABC[abc[0] -1] = 0;
			else if(c == 1 && a == 1)
				ABC[abc[1]-1] = 0;
		}
		for(int i = 0 ; i < ABC.length;i++)
			System.out.println(ABC[i]);
	}
}