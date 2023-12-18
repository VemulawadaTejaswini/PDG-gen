import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		String str = "";

		Stack<Character> st = new Stack<Character>();

		for(int i=0; i<n; i++){
			if(s.charAt(i) == '('){
				st.add(s.charAt(i));
			}else{
				if(!st.empty()){
					str += st.pop() + ")";
				}else{
					str = "(" + str + ")";
				}
			}
		}

		String str1 = "";
		while(!st.empty()){
			str += st.pop() + "";
			str1 += ")";
		}

		str = str + str1;
		System.out.println(str);
	}
}
