import java.util.*;
public class Main {
    public static long mod(long i, long j) {
    return (i % j) < 0 ? (i % j) + 0 + (j < 0 ? -j : j) : (i % j + 0);
    } 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
        a--;
		StringBuilder sb = new StringBuilder();
        String str[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        while(a>=0){int b = (int)mod(a,26);                   
                    sb.append(str[b]);
                    a/=26;
                    a--;}
		String ans = sb.toString();
        StringBuffer ans1 = new StringBuffer(ans);
		System.out.println(ans1.reverse().toString());
	}
}