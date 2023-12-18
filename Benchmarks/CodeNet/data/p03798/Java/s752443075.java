
import java.util.*;
public class Main {

	private static final int m = 0;
	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
int 	n=sc.nextInt();
String s=sc.next();
String ss="";
Deque<Character> dq=new LinkedList<>();

char a[]=new char[n+1];
if(s.charAt(0)=='o') {
a[0]='S';
a[1]='S';
}else {
a[0]='S';
a[1]='W';
}
for(int i=1;i<n-1;i++) {
if(s.charAt(i)=='o') {
	if(a[i-1]=='S'&&a[i]=='S'||a[i-1]=='W'&&a[i]=='W') {
		a[i+1]='S';
	}else if(a[i-1]=='S'&&a[i]=='W'||a[i-1]=='W'&&a[i]=='S') {
		a[i+1]='W';
	}
}else {
	if(a[i-1]=='S'&&a[i]=='S'||a[i-1]=='W'&&a[i]=='W') {
		a[i+1]='W';
	}else if(a[i-1]=='S'&&a[i]=='W'||a[i-1]=='W'&&a[i]=='S') {
		a[i+1]='S';
	}
}

}
if(s.charAt(n-1)=='o') {
	if(a[0]==a[n-2]) {
		for(int i=0;i<n;i++)
			System.out.print(a[i]);
		System.out.println();
	}else {
		System.out.println(-1);
	}
}else {
	if(a[0]!=a[n-2]) {
	
	for(int i=0;i<n;i++)
	System.out.print(a[i]);
System.out.println();
}else {
System.out.println(-1);
}
}


	}
}
