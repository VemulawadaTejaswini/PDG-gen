class Main{
	public static void main(String[]$){
		String v=new java.util.Scanner(System.in).next(),r="";
		for(int i=0;i<v.length();i+=2)
			r+=v.charAt(i);
		System.out.println(r);
	}
}