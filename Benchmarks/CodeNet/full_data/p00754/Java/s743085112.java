import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    
	    char[] charData = sc.nextLine().toCharArray();
	     
	    if(charData[0] == '.') break;

	    Stack<Character> st = new Stack<Character>();
	    
	    /*
	    // ティツ。ツィテァツ、ツコテ」ツ?療」ツ?ヲテ」ツ?ソテ」ツつ?
	    System.out.print("[");
	    for(int i = 0;i<charData.length;i++){
		System.out.print(charData[i] + " ");
	    }
	    System.out.println("]");
	    */
	    
	    for(int i = 0;i<charData.length;i++){
		if(charData[i] == '(') st.push('(');
		if(charData[i] == '[') st.push('[');
		if(!st.empty()){
		    if(charData[i] == ')' && st.peek().equals('(')) st.pop();
		    if(charData[i] == ']' && st.peek().equals('[')) st.pop();
		}else{
		    if(charData[i] == ')' || charData[i] == ']') st.push(charData[i]);
		}
	    }
	    
	    System.out.println(st.empty() ? "yes" : "no");
	    
	}
    }
}