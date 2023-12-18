import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		String a = str[0];
		String b = str[1];
		
        String str1 = "";
        for(int i = 0; i < Integer.valueOf(b); i++) {
        	str1+=a;
        }
        
        String str2 = "";
        for(int i = 0; i < Integer.valueOf(a); i++) {
        	str2+=b;
        }
        int result = Integer.compare(Integer.valueOf(a), Integer.valueOf(b));
        if(result == 0) System.out.println(str1);
        else if(result == -1) System.out.println(str1);
        else if(result == 1) System.out.println(str2);
	}
}