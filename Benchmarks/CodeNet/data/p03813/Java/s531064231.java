class Sample{
	String s;
	String ss;
	Sample(String str){
		s = str;
	}

	int searchA(){
		return s.indexOf("A");
	}
	int searchZ(){
		return s.lastIndexOf("Z") + 1;
	}

	public static void main(String[] args){
		Sample sample = new Sample(args[0]);
		int start = sample.searchA();
		int end = sample.searchZ();
		System.out.println(end - start);

	}
}
