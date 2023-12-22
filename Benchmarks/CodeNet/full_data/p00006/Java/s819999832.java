import java.util.*;


public class aoj0006 {
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System. in);
		String line = sc.nextLine();
		char[] str = line.toCharArray();
		
		char[] rts = new char[20];
		
		for(int i=0;i<20;i++){
			str[20-i]=rts[i];
		}
		
		for(int i=0;i<20;i++){
		System.out.print(rts[i]);
		}
	}
}


