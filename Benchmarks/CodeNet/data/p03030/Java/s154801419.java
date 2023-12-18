import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
 class Main {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0 ;
		Main m = new Main();
		
		ArrayList<Var>  a = new ArrayList<>();
		for(int i = 0 ; i < n ; i++) {
			
			 a.add(m.new Var(scan.next() , scan.nextInt() , i+1));
			 //System.out.println(a.get(i).s);
		}
		
		Collections.sort(a,new Comparator<Var>() {

			@Override
			public int compare(Var o1, Var o2) {
				if(o1.s.compareTo(o2.s) != 0)
					return o1.s.compareTo(o2.s) ;
				else {
					return o1.a < o2.a ? 1:-1;
				}
			      
			}
			
		});
		//System.out.print(a);
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println(a.get(i).id);
		}

	 
		
	}
	class Var{
		String s ; 
		int  a ;
		int id ;
		Var(String s  , int a , int id){
			this.a =a ; 
			this .s =s ; 
			this.id = id ;
		}
	}


}	