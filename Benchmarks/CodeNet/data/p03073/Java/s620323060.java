import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);

	String s=sc.next();
	char[] c = s.toCharArray();

char test1[]=new char[s.length()];
char test2[]=new char[s.length()];

	for(int i=0;i<=s.length()-1;i++){
test1[i]=Zelo1(i);
test2[i]=Zelo2(i);
	}

	int te1,te2;
	te1=0;
	te2=0;
for(int i=0;i<=s.length()-1;i++){
	if(c[i]!=test1[i]){
te1++;
	}

	if(c[i]!=test2[i]){
		te2++;
	}



}
System.out.println(Math.min(te1, te2));

	}

	static public char Zelo1(int i) {
		int a = 1-i % 2;
		String ze = Integer.toString(a);
char x=ze.charAt(0);
		return x;

	}

	static public char Zelo2(int i) {
		int a = i % 2;
		String ze = Integer.toString(a);
char x=ze.charAt(0);
		return x;

	}
}