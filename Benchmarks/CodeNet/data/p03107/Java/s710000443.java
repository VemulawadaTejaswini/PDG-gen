import java.util.*;

public class Main {
	
	static int result = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] strArray = s.split("");
		
		List<Integer> list = new ArrayList<>();
		for(int tmp = 0; tmp < strArray.length ; tmp++) {
			list.add(Integer.parseInt(strArray[tmp]));
		}
		remove(list);
	}
	
	private static void remove(List<Integer> list) {
		boolean flag = false;
		for(int tmp2 = 0 ; tmp2 < list.size() - 1 ; tmp2++) {
			if((list.get(tmp2) == 0 && list.get(tmp2 + 1) == 1) || (list.get(tmp2) == 1 && list.get(tmp2 + 1) == 0)) {
				list.remove(tmp2 + 1);
				list.remove(tmp2);
				flag = true;
				result += 2;
			}
		}
		if(flag == true) {
			remove(list);
		}else {
			System.out.println(result);
		}
	}
}