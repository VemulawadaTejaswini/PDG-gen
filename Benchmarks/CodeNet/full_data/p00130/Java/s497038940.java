import java.io.*;
import java.util.*;
import java.lang.*;

class Main{

    public static void main(String args[])throws IOException{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	//StringBuffer s = new StringBuffer("a->b");
	//s.replace(s.indexOf("->"),s.indexOf("->")+2,"  ");
	//System.out.println(s);

	int n;
	String sn;
	sn = in.readLine();
	n = Integer.parseInt(sn);
	for(int cnt = 1;cnt <= n;cnt++){
	    LinkedList<Character> list = new LinkedList<Character>();
	    boolean[] used = new boolean[27];
	    String input = new String();
	    for(int i=0;i<27;i++)used[i] = false;
	    input = in.readLine();
	    StringBuffer line = new StringBuffer(input);
	    list.add(line.charAt(0));
	    used[line.charAt(0)-'a'] = true;
	    while(!(line.indexOf("->") == -1 && line.indexOf("<-") == -1)){
	
		if(line.indexOf("<-") == -1 || ( line.indexOf("<-") != -1 &&    line.indexOf("->") != -1 &&line.indexOf("->") < line.indexOf("<-") )){
		       

		char c = line.charAt(line.indexOf("->")+2);    
		    if(!used[c-'a']){
			list.addLast(c);
			used[c-'a'] = true;
		    }
		    int pos = line.indexOf("->");
		    line.replace(pos,pos+2,"  ");
  
		}
		else if(line.indexOf("->") == -1 ||  (line.indexOf("->") != -1 && line.indexOf("<-") != -1  &&  line.indexOf("->") > line.indexOf("<-"))){
		   
		    char c = line.charAt(line.indexOf("<-")+2);	
		    if(!used[c-'a']){
			list.addFirst(c);
			used[c-'a'] = true;
		    }
		    int pos = line.indexOf("<-");
		    line.replace(pos,pos+2,"  ");
		}
		else{
		    System.out.println("WTH");
		}
	
	    }
	    for(int i=0;i<list.size();i++){
		System.out.print(list.get(i));
	    }
	    System.out.println("");
	}

    }

}