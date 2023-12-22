import java.util.Scanner;

public class Main {

	public static void split(int x, int y) {

		int first = 1;
		
		for(int index = 0; index < list_size; index++){
			final int card_first = list_first[index];
			final int card_last  = list_last [index];

			final int last = first + (card_last - card_first);

			//System.out.println(x + " " + y + " " + first + " " + last + " "
			//		+ card_first + " " + card_last);

			if (first <= x && last <= x) {
				a_list_add(card_first, card_last);
				
			} else if (first <= x) {
				final int sp1 = x - first + 1;
				
				a_list_add(card_first, card_first + sp1 - 1);

				if (last <= y) {
					b_list_add(card_first + sp1, card_last);
				} else {
					final int sp2 = y - x;
					
					b_list_add(card_first + sp1, card_first + sp1 + sp2 - 1);
					c_list_add(card_first + sp1 + sp2, card_last);
				}

			} else if (first <= y && last <= y) {
				b_list_add(card_first, card_last);

			} else if (first <= y) {
				final int sp1 = y - first + 1;

				b_list_add(card_first, card_first + sp1 - 1);
				c_list_add(card_first + sp1, card_last);
				
			} else {
				c_list_add(card_first, card_last);
				
			}

			first = last + 1;
		}
	}
	
	public static final int MAX = 5000 * 3 + 1;
	
	public static int[] list_first = new int[MAX];
	public static int[] list_last = new int[MAX];
	public static int   list_size = 0;
	
	public static int[] a_list_first = new int[MAX];
	public static int[] a_list_last = new int[MAX];
	public static int   a_list_size = 0;
	
	public static int[] b_list_first = new int[MAX];
	public static int[] b_list_last = new int[MAX];
	public static int   b_list_size = 0;
	
	public static int[] c_list_first = new int[MAX];
	public static int[] c_list_last = new int[MAX];
	public static int   c_list_size = 0;
	
	public static void list_add(int first, int last){
		list_first[list_size] = first;
		list_last [list_size] = last;
		list_size++;
	}
	
	public static void a_list_add(int first, int last){
		a_list_first[a_list_size] = first;
		a_list_last [a_list_size] = last;
		a_list_size++;
	}
	
	public static void b_list_add(int first, int last){
		b_list_first[b_list_size] = first;
		b_list_last [b_list_size] = last;
		b_list_size++;
	}
	
	public static void c_list_add(int first, int last){
		c_list_first[c_list_size] = first;
		c_list_last [c_list_size] = last;
		c_list_size++;
	}
	
	public static void list_clear(){
		list_size = 0;
	}
	
	public static void additional_list_clear(){
		a_list_size = 0;
		b_list_size = 0;
		c_list_size = 0;
	}
	
	public static void all_list_clear(){
		list_clear();
		additional_list_clear();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			list_add(1, n);

			final int m = sc.nextInt();
			final int p = sc.nextInt();
			final int q = sc.nextInt();
			final int r = sc.nextInt();

			for (int i = 0; i < m; i++) {
				final int x = sc.nextInt();
				final int y = sc.nextInt();

				//System.out.println(list_first + " " + list_last);
				split(x, y);
				list_clear();
				
				for(int index = 0; index < c_list_size; index++){
					list_add(c_list_first[index], c_list_last[index]);
				}
				for(int index = 0; index < b_list_size; index++){
					list_add(b_list_first[index], b_list_last[index]);
				}
				for(int index = 0; index < a_list_size; index++){
					list_add(a_list_first[index], a_list_last[index]);
				}

				additional_list_clear();
			}

			//System.out.println(list_first);
			//System.out.println(list_last);

			int sum = 0;
			split(p - 1, q);
			// System.out.println(a_list + " " + b_list + " " + c_list);
			for(int index = 0; index < b_list_size; index++){
				final int first = b_list_first[index];
				final int last = b_list_last[index];

				//System.out.println(first + " : " + last);

				sum += Math.max(0, Math.min(last, r) - first + 1);
			}
			System.out.println(sum);
			
			all_list_clear();
		}
	}

}