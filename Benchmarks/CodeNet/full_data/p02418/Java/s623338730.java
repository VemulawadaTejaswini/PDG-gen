import java.util.*;
 
class Main{
    public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.next());
		String str = scan.next();

		sb.append(sb);
		int a = sb.indexOf(str);
		if(a != -1){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
    }
}