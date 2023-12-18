package text;

public class main {
	public main(String[] args) {
		String s = args[0];
		int w = Integer.parseInt(args[1]);
		String str[] = s.split("");
		
		String st = "";
		
		for(int i=0;i < str.length;i =  i + w) {
			st = st + str[i];
		}
		System.out.println(st);
	}
}
