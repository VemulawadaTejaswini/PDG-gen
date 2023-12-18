import java.util.Scanner;

class Rest {
	
	
	public String s;
	public int p;
	public int index;
	
	public Rest left;
	public Rest right;
	
	public Rest(String s, int p, int i) {
		this.s = s;
		this.p = p;
		this.index = i;
		this.left = this.right = null;
	}
};


public class Main {
	
	public static void showAll(Rest r) {
		if(r.left != null) {
			showAll(r.left);
		}
		System.out.print(r.index);
		
		
		System.out.print(" ");
		System.out.print(r.s);
		System.out.print(" ");
		System.out.println(r.p);

		if(r.right != null) {
			showAll(r.right);
		}
	}
	
	public static int compare(String a, String b) 
	{
		for(int i=0; i < a.length() && i < b.length() ; i++) {
			if(a.charAt(i)<b.charAt(i)) {
				return -1;
			}
			if(a.charAt(i)>b.charAt(i)) {
				return 1;
			}
		}
		
		if(a.length() == b.length()) {
			return 0;
		}

		if(a.length()<b.length()) {
			return -1;
		} else {
			return 1;
		}
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String buf;
		int count     = sc.nextInt();
		buf = sc.nextLine();

		Rest top = null;
		
		for(int i = 0; i < count; i++) {
			String s=sc.next();
			int p = sc.nextInt();
			
			Rest r = new Rest( s , p , i+1 );

			if(top == null) {
				top = r;
			} else {
				Rest tmp = top;

				while(true) {
					int ans = compare( tmp.s , r.s );
					if(ans == 1) {
						if(tmp.left == null) {
							tmp.left = r;
							break;
						}
						tmp = tmp.left;
					} else {
						if(ans == -1) {
							if(tmp.right == null) {
								tmp.right = r;
								break;
							}
							tmp = tmp.right;
						} else {

							if(r.p > tmp.p ) {
								if(tmp.left == null) {
									tmp.left = r;
									break;
								}
								tmp = tmp.left;
							} else {
								if(tmp.right == null) {
									tmp.right = r;
									break;
								}
								tmp = tmp.right;
							}
						}
					}
				}
			}
		}

		showAll(top);
	}
}
