import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		Vector<Integer> left = new Vector<>();
		Vector<Integer> right= new Vector<>();
		for (int i = 0;i < n; ++i){
			if (i%2 == 0){
				right.add(Integer.parseInt(scan.next()));
			}else{
				left.add(Integer.parseInt(scan.next()));
			}
		}

		for (int i = left.size()-1;i >=0; --i ){
			System.out.print(left.elementAt(i)+" ");
		}
		int size = right.size();
		for(int i = 0; i < size; ++i){
			System.out.print(right.elementAt(i)+" ");
		}





	}
}
//end
