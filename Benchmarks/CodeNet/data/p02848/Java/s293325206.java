import java.util.Scanner;

public class Main {
	static char[] AZ = {'A','Z'};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx = sc.nextInt();
		String str = sc.next();
		sc.close();
		char[] c = str.toCharArray();
		for(int i=0;i<c.length;i++) {
			System.out.print(slide(c[i], idx));
		}
	}
	static char slide(char c, int key)
	{
	    int ret = c + key;
	    if(ret>AZ[1]) {
	    	ret = ret - AZ[1] + AZ[0] -1;
	    	return (char)ret;
	    }
	    return (char)ret;
	}
}
