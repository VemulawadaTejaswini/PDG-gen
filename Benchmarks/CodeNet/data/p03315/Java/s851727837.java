import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	String S=stdIn.next();
	int i=0;
	for(int j=0;j<4;j++){
	    if(S.charAt(j)=='+'){
		i++;
	    }else{
		i--;
	    }
	}
	System.out.println(i);
    }
}
		    
	    
