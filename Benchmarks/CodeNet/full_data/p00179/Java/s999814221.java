import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			ArrayDeque<StringBuffer> q = new ArrayDeque<StringBuffer>();
			HashSet<String> hs = new HashSet<String>();
			String in_str;
			in_str = sc.next();
			StringBuffer sb = new StringBuffer(in_str);
			if(in_str.equals("0"))
				break;
			q.add(sb);
			hs.add(in_str);
			boolean flg_continue = true;
			for(int t = 0; flg_continue; t++) {
				ArrayDeque<StringBuffer> nex = new ArrayDeque<StringBuffer>();
				while(q.size() != 0 && flg_continue) {
					String a = q.poll().toString();
					boolean flg = true;
					for(int i = 1; i < a.length(); i++) {
						if(a.charAt(i-1) != a.charAt(i)) {
							StringBuffer push = new StringBuffer(a);
							char c = (char)((int)'r'+(int)'g'+(int)'b'-(int)a.charAt(i-1)-(int)a.charAt(i));
							push.setCharAt(i-1,c);
							push.setCharAt(i,c);
							if(!hs.contains(push.toString())) {
								hs.add(push.toString());
								nex.add(push);
							}
							flg = false;
						}
					}
					if(flg) {
						System.out.println(t);
						flg_continue = false;
					}
				}
				q = nex;
				if(flg_continue && nex.isEmpty()) {
					System.out.println("NA");
					flg_continue = false;
				}
//				System.out.print("t:");
//				System.out.print(t);
//				System.out.print(" size:");
//				System.out.println(q.size());
			}
		}
	}
}