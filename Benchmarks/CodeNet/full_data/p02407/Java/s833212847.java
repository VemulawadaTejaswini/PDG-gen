import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();

		for(int i=0; i<num; i++){
			list.add(scan.nextInt());
		}
		Collections.reverse(list);
		for(int i: list){
			sb.append(i + " ");
		}

		System.out.println(sb);
	}
}