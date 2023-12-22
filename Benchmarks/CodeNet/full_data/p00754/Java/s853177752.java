import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	boolean maru=false,kaku=false,check=true;

	while(sc.hasNext()){
	    
	    char[] charData = sc.nextLine().toCharArray();
	     
	    if(charData[0] == '.') break;

	    Stack<Character> st = new Stack<Character>();
	    
	    for(int i = 0;i<charData.length;i++){
	    	if(charData[i] == '('){ st.push('('); maru=true; }
	    	if(charData[i] == '['){ st.push('['); kaku=true; }
    		if(charData[i] == ')' && !maru){ check = false; }
    		if(charData[i] == ']' && !kaku){ check = false; }
	    	if(!st.empty()){
	    		if(charData[i] == ')' && st.peek().equals('(')){
	    			st.pop();
	    			if(st.search('(')==-1) maru = false;
	    		}
	    		if(charData[i] == ']' && st.peek().equals('[')){
	    			st.pop();
	    			if(st.search('[')==-1) kaku = false;
	    		}        
			}
	    }
	    
	    System.out.println(st.empty() && check ? "yes" : "no");
	    
	    maru=false; kaku=false; check=true;
	    
		}
    }
}