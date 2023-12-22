import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i=1;
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			if(!(str.equals("0"))){
				System.out.println("Case "+(i+1)+": "+str);
				i=i+1;
			}
		}
	}
}