import java.util.StringTokenizer;

class Main {
	public static void main(String[] args){

	String str= new java.util.Scanner(System.in).nextLine();
	StringTokenizer st = new StringTokenizer(str," ");
	int x = Integer.valueOf(st.nextToken());
	int y = Integer.valueOf(st.nextToken());
	int l = 2*x+2*y;
	int s =  x*y;
	System.out.println(l+" "+s);
		 
	 }
}