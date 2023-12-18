import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc  = new Scanner(System.in);

		int o= 0 ,p = 0,q = 0;
		long a = 0, b = 0, c = 0;
		String str = "";

		

        String s1 = sc.next();
        char[] c1 = s1.toCharArray();
        
        for(int i= s1.length()-1;i>=0;i--){
            
            if( i!=0&&c1[i]=='B'&&c1[i-1]!='B') c1[i-1] = ' ';
//            if( c1[i]=='B') c1[i-1] = ' ';
            if(c1[i]=='0'||c1[i]=='1') str += c1[i] ;
            
        }

        System.out.print(new StringBuffer(str).reverse());
        System.out.println();
	}
}