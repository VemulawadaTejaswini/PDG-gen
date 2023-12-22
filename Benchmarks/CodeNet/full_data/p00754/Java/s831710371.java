import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        while(true){
        	String tmp=scan.nextLine();
        	if(tmp.equals("."))break;
        	char [] line =tmp.toCharArray();
        	Stack <Character> scale =new Stack<Character>();
        	String ans="yes";
        	for(int i=0;i<line.length;i++){
        		switch(line[i]){
        		case '(' :
        			scale.push(line[i]);
        			break;
        		case '[' :
        			scale.push(line[i]);
        			break;
        		case ')' :
        			if(!scale.empty() && scale.pop()=='(');
        			else {
        				i=line.length;
        				ans = "no";
        			}
        			break;
        		case ']' :
        			if(!scale.empty() && scale.pop()=='[');
        			else {
        				i=line.length;
        				ans = "no";
        			}
        			break;
        		}
        	}
        	if(!scale.empty())ans="no";

        	System.out.println(ans);
        }
    }
}
        	