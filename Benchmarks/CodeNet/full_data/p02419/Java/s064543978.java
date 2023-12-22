import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		String W = s.next().toLowerCase();
		String T="";
		String txt = "";
		int cnt=0;
		while(!"end_of_text".equals(txt)){
			if(W.equals(txt))cnt++;
			txt = s.next().toLowerCase();
		}
		System.out.println(cnt);
	}
	public static void main(String args[]){
		new Main().run();
	}
}