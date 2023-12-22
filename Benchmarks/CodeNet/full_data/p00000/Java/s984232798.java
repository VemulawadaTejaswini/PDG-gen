class Main{
    public static void main(String[] a){
		String s = "";
		for(byte i=1;i<10;i++){
			for(byte j=1;j<10;j++){
				s+=i+"x"+j+"="+(i*j)+"\n";
			}
		}
		System.out.println(s.trim());
    }
}