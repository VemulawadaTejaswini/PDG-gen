import java.util.*;
import java.math.*;
 import static java.util.stream.Collectors.toList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入
		String s = sc.next();
		int maxLength = 0;
		int tempLength =0;

		for(int i=0;i<s.length();i++){
			String ss = s.substring(i,i+1);
			if(isContain(ss)){
				tempLength++;
			}else{
				maxLength =Math.max(tempLength,maxLength);
				tempLength =0;
			}
		}
		maxLength =Math.max(tempLength,maxLength);
			System.out.println(maxLength);
 
	}

	public static boolean isContain(String n){
		if(n.equals("A")){
			return true;
		}else if(n.equals("G")){
			return true;
		}else if(n.equals("C")){
			return true;
		}else if(n.equals("T")){
			return true;
		}
		return false;
	}
}


