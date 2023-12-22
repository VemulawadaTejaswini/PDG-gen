
import java.util.*;
import java.util.regex.Pattern;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i < n; i++){
			String str = sc.next();
			boolean result = Pattern.matches(">'(=+)#(=)+\\~", str);
			if(result){
				String str1 = str.replaceAll(">'(=+)#=+\\~", "$1");
				String str2 = str.replaceAll(">'=+#(=+)\\~", "$1");
				if(str1.length() == str2.length()){
					System.out.println("A");
				}
				else{
					System.out.println("NA");
				}
			}
			else{
				result = Pattern.matches(">\\^(Q=)+\\~\\~", str);
				if(result)
					System.out.println("B");
				else
					System.out.println("NA");
			}
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}