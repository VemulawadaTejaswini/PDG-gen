import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
        	String s = cin.next();
        	System.out.println(getNum(s));
        }
    }
    public static int getNum(String s){
    	int count=0;
    	for(int i=0;i<s.length();i++){
    		if(s.charAt(i)=='p') count++;
    	}
    	return s.length()/2-count;
    } 
}