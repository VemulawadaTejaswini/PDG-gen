import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		String t=sc.next();
		boolean j=false;
		
		for(int i=0;i<t.length()-1;i++){
			if(t.charAt(i)==t.charAt(i+1)){
				System.out.println(i+1+" "+i+2);
				j=true;
				break;
			}
			if(i<t.length()-2 && t.charAt(i)==t.charAt(i+2)) {
				j=true;
				System.out.println(i+1+" "+i+3);
				break;
			}
		}
		if(j==false)System.out.println("-1 -1");
	}

}
