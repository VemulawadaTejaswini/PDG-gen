import java.util.*;
class Main{
    void run(){
	Scanner sc=new Scanner(System.in);
	int M=sc.nextInt();
	sc.nextLine();
	for(int attend=0;attend<M;attend++){
	    StringBuffer text=new StringBuffer(sc.nextLine());
	    int cur=0;
	    int n=sc.nextInt();
	    String command1;
	    String command2;
	    sc.nextLine();
	    for(int i=0;i<n;i++){
		String command=sc.nextLine();
		//System.out.println(command);
		for(int j=0;;j++){
		    if(command.charAt(j)==' '){
			command1=command.substring(0,j);
			command2=command.substring(j+1);
			break;
		    }
		}
		if("forward".equals(command1)){
		    if("char".equals(command2)){
			cur=cur<text.length()? cur+1:cur;    
		    }
		    else{
			for(;cur<text.length()&&text.charAt(cur)==' ';cur++);
			for(;cur<text.length()&&text.charAt(cur)!=' ';cur++);
		    }
		}
		if("backward".equals(command1)){
		    if("char".equals(command2)){
			cur=cur>0? cur-1:cur;    
		    }
		    else{
			for(;cur>0&&text.charAt(cur-1)==' ';cur--);
			for(;cur>0&&text.charAt(cur-1)!=' ';cur--);
		    }  
		}
		if("insert".equals(command1)){
		    text.insert(cur,command2.substring(1,command2.length()-1));
		    cur+=command2.length()-2;
		}		       
		if("delete".equals(command1)){
		    if("char".equals(command2)){
			if(cur!=text.length()){
			    text.deleteCharAt(cur);
			}
		    }
		    else{
			int temp=cur;
			for(;cur<text.length()&&text.charAt(cur)==' ';cur++);
			if(cur==text.length())break;
			for(;cur<text.length()&&text.charAt(cur)!=' ';cur++);
			text.delete(temp,cur);
			cur=temp;
		    }
		}
		//print(text,cur);
	    }
	    print(text,cur);
	}
	
    }
    void print(StringBuffer text,int cur){
	    text.insert(cur,"^");
	    System.out.println(text);
	    text.deleteCharAt(cur);
    }
    public static void main(String[] args){
	new Main().run();
    }
}