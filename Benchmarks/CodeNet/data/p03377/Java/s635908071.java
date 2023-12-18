import java.util.*;

public class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){
		return Integer.parseInt(s.next());
	}

	public static void main(String[]$){
		System.out.println(
				gInt()+gInt()>=gInt()
				?"YES":"NO"
				);
	}
}