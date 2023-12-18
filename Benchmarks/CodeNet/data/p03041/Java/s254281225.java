import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
		String s=sc.next();
	char c[]=s.toCharArray();
k--;
if(c[k]=='A'){
	c[k]='a';
}else if(c[k]=='B'){
	c[k]='b';
}else{
	c[k]='c';
}

for(int i=0;i<n;i++){
	System.out.print(c[i]);
}System.out.println();

	}}