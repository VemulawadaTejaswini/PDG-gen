import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		char[]arr = new char[300001];
		for(int i = 0 ; i<s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		int arrindex = s.length();
		char[]front = new char[200001];
		int frontindex = 0;
		int Q = sc.nextInt();
		boolean reverse = false;
		while(Q-->0) {
			int op = sc.nextInt();
			if(op == 1) {
				reverse = !reverse;
			}
			else {
				int pos = sc.nextInt();
				char add = sc.next().charAt(0);
				if(pos == 1 && !reverse) {
					front[frontindex] = add;
					frontindex++;
				}
				else if(pos == 1 && reverse) {
					arr[arrindex] = add;
					arrindex++;
			//		System.out.println("add " + add);
				}
				else if(pos == 2 && !reverse) {
				//	System.out.println("add " + add);
					arr[arrindex] = add;
					arrindex++;
				}
				else if(pos == 2 && reverse) {
					front[frontindex] = add;
					frontindex++;
				}
			}
		}
	//	String res = "";
		if(!reverse) {
			for(int i = frontindex-1; i>=0 ; i--) {
				System.out.print(front[i]);
		//		res+=front[i];
			}
			for(int i = 0; i<arrindex; i++) {
				System.out.print(arr[i]);
				//res+=arr[i];
			}
		}
		else {
			for(int i = arrindex-1 ; i>=0; i--) {
				//res+=arr[i];
				System.out.print(arr[i]);
			}
			for(int i = 0; i<frontindex; i++) {
				//res+=front[i];
				System.out.print(front[i]);
			}
		}
		System.out.println();
	}
}
