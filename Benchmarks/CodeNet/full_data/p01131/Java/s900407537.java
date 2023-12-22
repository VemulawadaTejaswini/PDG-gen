import java.util.Scanner;

public class Main {
	void run(){
		Scanner sc = new Scanner(System.in);
		char map[][] = new char[10][];
		String str = ".,!?";
		map[1] = str.toCharArray();
		str = "abc";
		map[2] = str.toCharArray();
		str = "def";
		map[3] = str.toCharArray();
		str = "ghi";
		map[4] = str.toCharArray();
		str = "jkl";
		map[5] = str.toCharArray();
		str = "mno";
		map[6] = str.toCharArray();
		str = "pqrs";
		map[7] = str.toCharArray();
		str = "tuv";
		map[8] = str.toCharArray();
		str = "wxyz";
		map[9] = str.toCharArray();
		int n = sc.nextInt();
		while(n-- != 0){
			char ch[] = sc.next().toCharArray();
			int count = 0;
			int botan = 0;
			str = "";
			for(int i=0; i < ch.length; i++){
				if(ch[i] == '0'){
					if(count > 0){
						str += String.valueOf(map[botan][(count-1)%map[botan].length]);
						count = 0;
					}
					else{
						continue;
					}
				}
				else{
					count++;
					botan = ch[i]-'0';
				}
			}
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		//new AOJ2006().run();
		new Main().run();
	}

}