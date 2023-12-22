import java.util.Scanner;

class Main{
	
	static int[] a = new int[]{1,0,0};
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str;
		String[] st;
		int x = 0;
		int y = 0;
		while(sc.hasNext()){
			str = sc.next();
			st = str.split(",",0);
			
			if(st[0].equals("A"))x = 0;
			if(st[1].equals("A"))y = 0;
			if(st[0].equals("B"))x = 1;
			if(st[1].equals("B"))y = 1;
			if(st[0].equals("C"))x = 2;
			if(st[1].equals("C"))y = 2;
			change(x, y);
		}
		
		if(a[0] == 1)
			System.out.println("A");
		if(a[1] == 1)
			System.out.println("B");
		if(a[2] == 1)
			System.out.println("C");
		}
	static void change(int x, int y){
		int n = a[x];
		a[x] = a[y];
		a[y] = n;
	}
}