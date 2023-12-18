import java.util.*;
class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		String[] SArray = S.split("");
		String[] TArray = T.split("");
		int x=0;
		if(SArray[0].equals(TArray[0])){x=x+1;};
		if(SArray[1].equals(TArray[1])){x=x+1;};
		if(SArray[2].equals(TArray[2])){x=x+1;};
		System.out.println(x);
	}
}