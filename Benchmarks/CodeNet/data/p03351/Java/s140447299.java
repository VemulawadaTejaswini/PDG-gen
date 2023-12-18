import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){
		return Integer.parseInt(s.next());
	}
	public static void main(String[] A){
		int a=gInt(),b=gInt(),c=gInt(),d=gInt();
		System.out.println(
				Math.abs(a-c)<=d||
				(Math.abs(a-b)<=d&&Math.abs(b-c)<=d)
				?"Yes":"No"
				);
	}
}
