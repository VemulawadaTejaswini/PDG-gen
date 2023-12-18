import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String args[]){
		run();
	}
	static int ans;
	static final int A = (int)Math.pow(10, 9) + 7;
	static void run(){
		Scanner scan = new Scanner(System.in);
		ans = 0;
		int n;
		n = scan.nextInt();
		ArrayList<Integer> diff = new ArrayList<Integer>(n);
		for(int i = 0; i < n; i++){
			diff.add(scan.nextInt());
		}
		boolean flag;
		flag = false;
		flag = check(n, diff);
		if(flag){
			System.out.println("0");
		}else{
			System.out.println((int)Math.pow(2, ans - 1) % A);
		}
	}
	static boolean check(int n, ArrayList<Integer> diff){
		if(n % 2 != 0){
			diff.remove(diff.indexOf(0));
			ans++;
			for(int i = 0; i < n; i++){
				ArrayList tmpDiff = new ArrayList(diff);
				if(diff.isEmpty()){
					return false;
				}
				int lastIndex = diff.lastIndexOf(ans * 2);
				if(lastIndex != -1){
					diff.remove(lastIndex);
				}
				int index = diff.indexOf(ans * 2);
				if(index != -1){
					diff.remove(index);
				}
				ans++;
				if(tmpDiff == diff){
					return true;
				}
			}
		}else{
			for(int i = 0; i < n; i++){
				ArrayList tmpDiff = new ArrayList(diff);
				if(diff.isEmpty()){
					return false;
				}
				int lastIndex = diff.lastIndexOf(ans * 2 + 1);
				if(lastIndex != -1){
					diff.remove(lastIndex);
				}
				int index = diff.indexOf(ans * 2 + 1);
				if(index != -1){
					diff.remove(index);
				}
				ans++;
				if(tmpDiff == diff){
					return true;
				}
			}
			ans++;
		}
		return true;
	}
}
