import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//入力
		String a = sc.next();
		String b = sc.next();
		//設定
		String h = "H";
		String d = "D";
		//出力
		if(a.equals(h) && b.equals(h)){
			System.out.println(h);
		}else if(a.equals(h) && b.equals(d)){
			System.out.println("D");
		}else if(a.equals(d) && b.equals(h)){
			System.out.println("D");
		}else if(a.equals(d) && b.equals(d)){
			System.out.println("H");
		}else{
			
		}
	}

}
