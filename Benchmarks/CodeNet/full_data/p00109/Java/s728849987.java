//Volume1-0109

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	//declare
	private static final int                   NUM   = 1,
			                                   OPE1  = 2,
			                                   OPE2  = 3,
			                                   SPRN  = 4,
			                                   EPRN  = 5,
			                                   EQ    = 6;
	private static final String                regex = "([0-9]+|\\+|-|\\*|/|\\(|\\)|=)(.*)";
	private static       ArrayList<String>     t     = new ArrayList<String>(),
			                                   rpn   = new ArrayList<String>();
	private static       ArrayDeque<String>    stack = new ArrayDeque<String>();
	private static       ArrayDeque<Integer>   ans   = new ArrayDeque<Integer>();


	public static void main(String[] args){

		Matcher m;
 		String  s;
 		int     n;

		//initialize
		Pattern token = Pattern.compile(regex);

		//input
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
        	t.clear();
        	rpn.clear();
        	stack.clear();
        	s = sc.nextLine();
        	while(s.length() != 0){
        		m = token.matcher(s);
        		if(m.find()){
        			t.add(m.group(1));
        			s = m.group(2);
        		}
        	}

        	//calculate
        	chg_notation();
        	calc();

        	//output
        	System.out.println(ans.pop());
        }
	}

	private static void calc(){

		int kind,a,b;
		for(String tkn:rpn){
			kind = isKind(tkn);
			if(kind == NUM){
				ans.push(Integer.parseInt(tkn));
			}else if(tkn.equals("+")){
				ans.push(ans.pop()+ans.pop());
			}else if(tkn.equals("-")){
				b = ans.pop();
				a = ans.pop();
				ans.push(a-b);
			}else if(tkn.equals("*")){
				ans.push(ans.pop()*ans.pop());
			}else if(tkn.equals("/")){
				b = ans.pop();
				a = ans.pop();
				ans.push(a/b);
			}
		}
	}

	private static void chg_notation(){
    	out:for(String tkn:t){
    		switch(isKind(tkn)) {
    			case NUM  : {rpn.add(tkn);break;}
    			case OPE1 : {}
    			case OPE2 : {
    			String top = stack.peek();
    				if(top != null && isKind(top) == OPE2){
    					rpn.add(stack.pop());
    				}
    				stack.push(tkn);
    				break;
    			}
        	    case SPRN :{
    				stack.push(tkn);
    				break;
        	    }
        	    case EPRN :{
        	    	String e;
        	    	while(true){
        	    		e = stack.pop();
        	    		if(isKind(e) != SPRN){
        	    			rpn.add(e);
        	    		} else {
        	    			break;
        	    		}
        	    	}
        	    	break;
        	    }
        	    case EQ : {
        	    	for(String e:stack){
        	    		rpn.add(e);
        	    	}
        	    	break out;
        	    }
        	}
    	}
	}

	private static int isKind(String s){
		int ret = -1;
		if     (s.matches("[0-9]+")) {ret = 1;}
		else if(s.matches("(\\+|-)")){ret = 2;}
		else if(s.matches("(\\*|/)")){ret = 3;}
		else if(s.matches("\\("))    {ret = 4;}
		else if(s.matches("\\)"))    {ret = 5;}
		else if(s.matches("="))      {ret = 6;}
		return ret;
	}
}