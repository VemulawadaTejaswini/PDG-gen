import java.util.*;
      
class SortNum{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int c = Integer.parseInt(scan.next());
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(a);
		num.add(b);
		num.add(c);
		Collections.sort(num);
		int d = num.size();   
		for(int i = 0; i < d; i++){ 
			int sortnum = num.get(i);
			if (i < d-1){ 
			System.out.print(sortnum + " ");
		} else {
			System.out.print(sortnum);
		}
		}
	}
}