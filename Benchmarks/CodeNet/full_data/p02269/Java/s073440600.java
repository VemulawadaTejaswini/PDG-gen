import java.util.Scanner;

public class Main {
	
	static int m = 1000003;
	static int[] T = new int[m];
	
	static int changeToInt(char c) {
		if(c == 'A') {
			return 1;
		}else if(c == 'C') {
			return 2;
		}else if(c == 'G') {
			return 3;
		}else {
			return 4;
		}
	}
	
	static int getKey(String str) {
		int sum = 0;
		int d = 1;
		int l = str.length();
		for(int i=0;i<l;i++) {
			d *= 5;
			char c = str.charAt(i);
			sum += d * changeToInt(c);
		}
		return sum;
	}
	
	static int h1(int key) {
		return key%m;
	}
	
	static int h2(int key) {
		return 1+(key%(m-1));
	}
	
	static int h(int key,int i) {
		return (h1(key) + i*h2(key)) %m;
	}
	
	static void insert(int key) {
		int i=0;
		boolean flag = true;
		while(flag) {
			int j = h(key,i);
			if(T[j] == 0) {
				T[j] = key;
				flag = false;
			}else {
				i += 1;
			}
		}
	}
	
	static void search(int key) {
		int i=0;
		boolean flag = true;
		while(flag) {
			int j = h(key,i);
			if(T[j] == key) {
				System.out.println("yes");
				flag = false;
			}else if(T[j] == 0 || i>=m) {
				System.out.println("no");
				flag = false;
			}else {
				i += 1;
			}
		}
	}
	
	void main() {
		for(int i=0;i<m;i++) {
			T[i] = 0;
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			String s = sc.next();
			String str = sc.next();
			//System.out.println(s +" "+ str);
			int key = getKey(str);
			//System.out.println(key);
			if(s.equals("insert")) {
				insert(key);
			}else {
				search(key);
			}
		}
		
	}

	public static void main(String[] args) {
		new Main().main();
	}

}

