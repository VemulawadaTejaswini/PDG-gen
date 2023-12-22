import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i<N;i++) {
			nums.add(scanner.nextInt());
		}

		for(int i = 0;i < nums.size();i++) {
			for(int j = 0;j < nums.size();i++) {
				if(i != j && nums.get(i) == nums.get(j))nums.remove(j);
			}
		}

		int result = 0;
		boolean flag = false;
		for(int i = 0;i<nums.size();i++) {
			for(int j = 0;j<nums.size();j++) {
				flag = false;
				if(i != j && nums.get(i) % nums.get(j) != 0) {
					flag = true;
				}else if(i != j && nums.get(i) % nums.get(j) == 0){
					break;
				}
			}
			if(flag)result++;
		}
		System.out.println(result);
		scanner.close();
	}
}