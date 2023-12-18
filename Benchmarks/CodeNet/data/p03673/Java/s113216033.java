
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		LinkedList<Integer> b = new LinkedList<Integer>();
		for(int i = 0; i < n; i++){
			if(i%2 == 0) b.addLast(in.nextInt());
			else b.addFirst(in.nextInt());
		}
		if(n%2 == 0)print(b,false);
		else print(b,true);
		in.close();
	}
	void print(LinkedList<Integer> a, boolean reverse){
		if(!reverse){
			String tab = "";
			for(Integer aa : a){
				System.out.print(tab + aa);
				tab = " ";
			}
		}else{
			String tab = "";
			for(int i = a.size()-1; i>= 0; i--){
				Integer aa = a.get(i);
				System.out.print(tab + aa);
				tab = " ";
			}
		}
	}

}
