import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int sL = s.length();
	String sT = s;
	for(int i = 0; i < s.length() / 2; i += 2) {
		sL -= 2;
		sT = sT.substring(0, sL);
		if(sT.substring(0, sL / 2).equals(sT.substring(sL/2))) {
			System.out.println(sL);
			break;
		}
	}
}
}
