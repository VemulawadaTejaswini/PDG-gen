import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner kbd =new Scanner(System.in);
		 String s=kbd.next();
		 String t=kbd.next();
     int z=s.length();
 String x=t.substring(0, z);
 System.out.println(x);
 if(x.compareTo(s)==0){
	 System.out.println("Yes");
 }else {
	 System.out.println("No");
 }
	}
}
