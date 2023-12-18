package abc114;

import java.util.Scanner;

public class Main {

	static long N = 0;

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		N = Long.parseLong(s);
		scan.close();
		Long.parseLong(s);
		Main main = new Main();
		System.out.println(main.dfs("0"));
	}
	
	public int dfs(String str){
//		System.out.println("inside "+str);
		if(Long.parseLong(str)>N){
			return 0;
		}
		int res = 0;
		if(str.contains("3")&&str.contains("5")&&str.contains("7")){
			res = 1;
		}
		String sft = "753";
		for(int i = 0; i<3; i++){
//			System.out.println("going inside "+""+str+sft.substring(i, i+1));
			res+=this.dfs(""+str+sft.substring(i, i+1));
//			System.out.println(str+sft.substring(i, i+1));
		}
		return res;
	}
}
