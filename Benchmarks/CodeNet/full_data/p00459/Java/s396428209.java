import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static class Cards{
		int first, last;

		public Cards(int first, int last) {
			super();
			this.first = first;
			this.last = last;
		}
		
		public int getSize(){
			return last - first + 1;
		}
		
		public int getLower(int l){
			//System.out.println(l + " " + first + " " + last);
			
			if(l < first){
				return 0;
			}else{
				//System.out.println(l - first + 1);
				return Math.min(last, l) - first + 1;
			}
		}
		
		public Cards split(int sp){
			if(sp < 0){
				return null;
			}else if(sp > this.getSize()){
				return null;
			}else if(sp == 0){
				return this;
			}else if(sp == getSize()){
				return this;
			}else{
				final int tmp_last = this.last;
				this.last = this.first + sp - 1; 
				return new Cards(this.first + sp, tmp_last);
			}
		}
		
		public String toString(){
			return this.first + " " + this.last;
		}
	}
	
	public static void split(LinkedList<Cards> main_list, int x, int y, LinkedList<Cards> a_list, LinkedList<Cards> b_list, LinkedList<Cards> c_list){
		int first = 1;
		
		for(Cards cards : main_list){
			//System.out.println(x + " " + y );
			//System.out.println(main_list);
			//System.out.println(a_list);
			//System.out.println(b_list);
			//System.out.println(c_list);
			
			final int last = first + cards.getSize() - 1;
			//System.out.println(x + " " + y + " : " + first + " " + last + " <> " + cards);
			
			if(first <= x && last <= x){
				a_list.add(cards);
			}else if(first <= x){
				Cards split = cards.split(x - first + 1);
				
				a_list.add(cards);
				
				if(last <= y){
					b_list.add(split);
				}else{
					Cards split2 = split.split(y - x);
					b_list.add(split);
					c_list.add(split2);
				}
			}else if(first <= y && last <= y){
				b_list.add(cards);
			}else if(first <= y){
				Cards split = cards.split(y - first + 1);
				
				b_list.add(cards);
				c_list.add(split);
			}else{
				c_list.add(cards);
			}
			
			first = last + 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Cards> list = new LinkedList<Cards>();
		
		LinkedList<Cards> a_list = new LinkedList<Main.Cards>();
		LinkedList<Cards> b_list = new LinkedList<Main.Cards>();
		LinkedList<Cards> c_list = new LinkedList<Main.Cards>();
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			list.add(new Cards(1, n));
			
			final int m = sc.nextInt();
			final int p = sc.nextInt();
			final int q = sc.nextInt();
			final int r = sc.nextInt();
			
			
			for(int i = 0; i < m; i++){
				final int x = sc.nextInt();
				final int y = sc.nextInt();
				
				split(list, x, y, a_list, b_list, c_list);
				
				list.clear();
				
				list.addAll(c_list);
				list.addAll(b_list);
				list.addAll(a_list);
				
				a_list.clear();
				b_list.clear();
				c_list.clear();
			}
			
			int sum = 0;
			split(list, p - 1, q, a_list, b_list, c_list);
			//System.out.println(a_list + " " + b_list + " " + c_list);
			for(Cards cards : b_list){
				sum += cards.getLower(r);
			}
			System.out.println(sum);
			

			list.clear();
			a_list.clear();
			b_list.clear();
			c_list.clear();
			
			System.gc();
		}
	}

}