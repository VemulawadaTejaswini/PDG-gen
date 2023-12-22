import java.io.*;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			int sumh = 0, sumt = 0;
			int n = Integer.parseInt(br.readLine());
			for(int i = 0;i < n;i++) {
				String[] s = br.readLine().split(" ");
				if(s[0].equals(s[1])) {
					sumh +=1;
					sumt += 1;
				}
				else if(sort(s[0], s[1]))
					sumt+=3;
				else
					sumh+=3;
			}
			System.out.println(sumt + " " + sumh);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	public static boolean sort(String f, String s) {
		int i = 0;
		while(i < f.length()) {
			if(f.charAt(i) < s.charAt(i))
				return false;
			else if(f.charAt(i) > s.charAt(i))
				return true;
			i++;
			if(i >= s.length())
				return true;
		}
		return false;
	}
}