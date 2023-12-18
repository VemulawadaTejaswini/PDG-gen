
public class Main{
	String s;
	public Main(String str){
		s = str;
	}

	public int searchA(){
		return s.indexOf("A");
	}
	public int searchZ(){
		return s.lastIndexOf("Z") + 1;
	}

	public static void main(String[] args){
		Main m = new Main(args[0]);
		int start = m.searchA();
		int end = m.searchZ();
		System.out.println(end - start);

	}
}

