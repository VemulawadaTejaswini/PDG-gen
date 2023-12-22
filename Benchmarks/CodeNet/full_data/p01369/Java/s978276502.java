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
				c.check(str.charAt(i));
			}
			c.print();
		}
	}
}
class Check{
	private String f = "yuiophjklnm";
	private boolean rflag = false;
	private int count = 1;
	void check(char word){
		Pattern p = Pattern.compile(String.valueOf(word));
	    Matcher m = p.matcher(f);
		if(m.find()){
			if(count==0){
				rflag=true;
			}
			if(rflag==false){
				count++;
				rflag=true;
			}
		}else if(count!=0 && rflag==true){
			count++;
		}
	}
	void print(){
		System.out.println(count-1);
		count=0;
	}
}