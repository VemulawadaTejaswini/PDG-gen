import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		while(true) {
			if(list.contains(num)) break;
			list.add(num);
			num = num % 2 == 0 ? num/2 : num*3 + 1;
		}
		System.out.println(list.size()+1);
	}
