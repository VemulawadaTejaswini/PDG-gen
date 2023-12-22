import java.util.*; 

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Long a = sc.nextLong();
		Long v = sc.nextLong();
		Long b = sc.nextLong();
		Long w = sc.nextLong();
		Long t = sc.nextLong();
		
		for(int i=1;i<=t;i++){
			a = a + v;
			b = b + w;
			System.out.println(a);
			System.out.println(b);
		}

		if(a>=b){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	  }
	}		  