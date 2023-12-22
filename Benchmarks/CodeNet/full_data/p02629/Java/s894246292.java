import java.util.*;
public class Main {
    public static long mod(long x, long y) {
    return x%y<0?x%y+(y<0?-y:y):x%y;
    } 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong()-1;
		StringBuilder sb = new StringBuilder();
        String str[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        while(a>=0){int b = (int)mod(a,26);                   
                    sb.append(str[b]);
                    a=a/26-1;
                   }
		String ans = sb.toString();
        StringBuffer sf = new StringBuffer(ans);
		System.out.println(sf.reverse().toString());
	}
}