import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	HashMap<String,Integer> hash=new HashMap<String, Integer>();
	public void run() {
		hash.put("I",1);
		hash.put("V",5);
		hash.put("X",10);
		hash.put("L",50);
		hash.put("C",100);
		hash.put("D",500);
		hash.put("M",1000);

		while (sc.hasNext()) {
			String str = sc.next();
			int[] data=new int[str.length()];
			for(int i=0;i<str.length();i++){
				data[i]=hash.get(str.charAt(i)+"");
			}
			int prev=data[0];
			int val=0;
			for(int i=1;i<data.length;i++){
				if(data[i]>prev){
					val-=prev;
				}else{
					val+=prev;
				}
				prev=data[i];
			}
			val+=data[data.length-1];

			ln(val);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}