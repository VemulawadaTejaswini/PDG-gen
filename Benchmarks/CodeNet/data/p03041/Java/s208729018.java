import java.util.Scanner;

class Main{
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		String s = stdIn.nextLine();
	    char[] a = new char[n];
	    for(int i = 0;i < n;i++)
	    	a[i] = s.charAt(i);
	    if(a[k] == 'A')
	    	a[k] = 'a';
	    else if(a[k] == 'B')
	    	a[k] = 'b';
	    else
	    	a[k] = 'c';
	    for(int i = 0;i < n;i++)
	    	System.out.print(a[i]);
	}
}