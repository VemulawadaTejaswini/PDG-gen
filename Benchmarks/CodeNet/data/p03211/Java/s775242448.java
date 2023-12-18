import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
String a=scan.next();
//int b=scan.nextInt();
//int c=scan.nextInt();
String b[]=new String[10];
for(int i=0;i<a.length();i++) {
	String str2=String.valueOf(a.charAt(i));
	b[i]=str2;
}
int c[]=new int[10];
for(int i=0;i<a.length();i++) {
	 c[i]=Integer.parseInt(b[i]);
}
int d[]=new int[10];
for(int i=0;i<a.length()-2;i++) {
	d[i]=c[i]*100+c[i+1]*10+c[i+2];
	 }
int ans=1000;
for(int i=0;i<a.length()-2;i++) {
	int kari=0;
	kari=753-d[i];
	if(kari<0) {
		kari*=-1;
	}
	if(kari<ans) {
		ans=kari;
	}
}
System.out.println(ans);

}
}
