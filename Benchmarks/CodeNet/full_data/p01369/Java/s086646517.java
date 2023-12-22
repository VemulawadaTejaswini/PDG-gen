import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(!(str=sc.next()).equals("#")){
			Check c = new Check();
			for(int i = 0 ; i < str.length(); i ++){
				c.check(str.charAt(i),i);
			}
			c.print();
		}
	}
}
class Check{
	private String f = "yuiophjklnm";
	private boolean rflag = false;
	private int count = 0;
	void check(char word,int i){
		Pattern p = Pattern.compile(String.valueOf(word));
	    Matcher m = p.matcher(f);
	    if(m.find()){
	    	if(i==0){
	    		rflag=true;
	    	}
	    	else if(rflag==false){
				count++;
				rflag=true;
			}
		}
	    else if(rflag==true){
			count++;
			rflag=false;
		}
	}
	void print(){
		System.out.println(count);
		count=0;
	}
}