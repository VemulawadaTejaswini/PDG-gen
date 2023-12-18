import java.util.*;
class Main /*atcoder beginner contest 42*/{
	public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			int n = s.nextInt() , l = s.nextInt();
			ArrayList<String> str = new ArrayList<String>();

			for(int i = 0;i < n;i++){
				String line =  s.next();
				str.add(line);
			}

			Collections.sort(str);

			String ans = "";
			for(int i = 0;i < n;i++)
				ans += str.get(i);
			System.out.println(ans);
	}
}