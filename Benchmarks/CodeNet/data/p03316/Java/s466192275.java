import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        	while(sc.hasNext()) {
        		
        		String b = sc.next();
        		int c  = Integer.parseInt(b);
        		char[] str = b.toCharArray();
        		int a = 0;
        		for(int i=0;i<str.length;i++) {
        			a += Integer.parseInt(String.valueOf(str[i]));
        		}
        		if(c%a==0) System.out.println("Yes");
        		else System.out.println("No");
        	}
        }
    }
}
