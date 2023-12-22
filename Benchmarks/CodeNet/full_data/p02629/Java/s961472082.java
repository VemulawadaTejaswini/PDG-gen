import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
        a--;
		StringBuilder sb = new StringBuilder();
        String str[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        while(a>=0){sb.append(str[(int)a%26]);a/=26;a--;}
		String ans = sb.toString();
        StringBuffer ans1 = new StringBuffer(ans);
		System.out.println(ans1.reverse().toString());
	}
}