import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m == 0 && n == 0) break;

			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int i=1;i<=m;i++){
				al.add(i);
			}

			for(int i=1,now=0;i<=n;i++,now=(now+1)%al.size()){
				String s = sc.next();
				if(!check(i,s)){
					al.remove(now);
					now--;
				}
			}

			System.out.println(al.toString().replaceAll("\\[|\\]|,",""));
		}
	}

	private static boolean check(int x,String s){
		String t = (x % 3 == 0 ? "Fizz" : "") + (x % 5 == 0 ? "Buzz" : "");
		if(t.isEmpty()) t += x;

		return s.equals(t);
	}
}