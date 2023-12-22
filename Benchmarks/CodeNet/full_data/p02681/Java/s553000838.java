import java.util.Scanner;
public class Main{
	int o,h,s,e;
	double q,w,a;
	String  i,l,k;
	Scanner scan=new Scanner(System.in);
	public void output() {
String[] date=new String[2];
for(o=0;o<2;o++) {
	date[o]=scan.next();
}
int len = date[0].length();
if(len-1==0) {
	i = date[1].substring(1);
}else {
 i = date[1].substring(0,len);
}
 if(date[0].equals(i)) {
	 System.out.println("Yes");
 }else {
	 System.out.println("No");
 }
// System.out.println(date[0]);
 //System.out.println(i);
	}
	public static void main(String[] args) {
		Main p=new Main();
		p.output();
	}
}