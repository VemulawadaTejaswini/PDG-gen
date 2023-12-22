import java.util.Scanner;

public class Main {
	static boolean LOCAL = System.getSecurityManager() == null;
	Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		new Main().run();
	}

	int[] array = new int[]{0,1,2,3,4,5,6,7,8,9,5,4,3,2,1};
	
	void run() {
		int T = sc.nextInt();
		for(int test = 0; test < T; test++){
			String ret = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
			String now = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
			int start = sc.nextInt();
			int goal = sc.nextInt();
			for(int i =0; i < array.length * 3; i++){
				int pos = array[i%array.length];
				if(pos==start){
					now = pos + " ";
				}
				else if(pos==goal){
					now += pos;
					if(ret.length() > now.length()) ret = now;
				}
				else now += pos + " ";
			}
			System.out.println(ret);
		}
	}
}