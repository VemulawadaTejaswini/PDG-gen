import java.util.Scanner;
class Main{
	public static void main(String[] args){
		String[] s = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		string input = scn.next();
		int j;
		for(int i=0;i<=6;i++){
			if(s[i]==input) j=7-i;
		}
		System.out.println(j);
	}
}