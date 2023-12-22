import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static String str = "";
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if( !sc.hasNext() )return false;
		for(int i = 0; i < 3; i++){
			int b = sc.nextInt();
			str += Integer.toString(b);
		}
		return true;
	}
	
	static void solve(){
		if( str.equals("100") || str.equals("010") || str.equals("000") ){
			System.out.println("Close");
		}else{
			System.out.println("Open");
		}
		str = "";
	}

}