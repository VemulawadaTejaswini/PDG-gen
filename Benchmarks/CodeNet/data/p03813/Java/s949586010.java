
public class Sample{
	String s;
	public Sample(String str){
		s = str;
	}

	public int searchA(){
		return s.indexOf("A");
	}
	public int searchZ(){
		return s.lastIndexOf("Z") + 1;
	}

	public static void main(String[] args){
		Sample sample = new Sample(args[0]);
		int start = sample.searchA();
		int end = sample.searchZ();
		System.out.println(end - start);

	}
}
