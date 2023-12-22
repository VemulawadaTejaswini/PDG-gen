import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String t;
		int i, cnt, idx;
		while(true){
			t = sc.next();
			if(t.equals("-")) break;
			cnt = sc.nextInt();
			for(i=0; i<cnt; i++){
				idx = sc.nextInt();
				t = t.substring(idx).concat(t.substring(0, idx));
			}
			System.out.println(t);
		}
	}
}