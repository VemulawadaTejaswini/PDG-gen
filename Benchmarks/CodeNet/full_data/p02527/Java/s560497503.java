import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int n =  scan.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0 ; i < n ; i++){
				list.add(scan.nextInt());
			}
			Collections.sort(list);
			Iterator it = list.iterator();
			System.out.print(it.next());
			while(it.hasNext()){
				System.out.print(" "+it.next());
			}
			System.out.println();
		}finally{
			scan.close();
		}
	}
}import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int n =  scan.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0 ; i < n ; i++){
				list.add(scan.nextInt());
			}
			Collections.sort(list);
			Iterator it = list.iterator();
			System.out.print(it.next());
			while(it.hasNext()){
				System.out.print(" "+it.next());
			}
			System.out.println();
		}finally{
			scan.close();
		}
	}
}