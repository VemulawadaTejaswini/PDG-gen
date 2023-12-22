
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.awt.geom.*;
import static java.util.Arrays.*;

class Main{
	public static int count;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		String str1;
		String str2;
		for(int i=0;i<n;i++){
			count = 0;
			str1 = sc.next();
			str2 = sc.next();
			int str1count = str1.length()-1;
			int str2count = str2.length()-1;
			func(str1,str2,str1count,str2count,0);
			out.println(count);
			out.flush();
		}
	}

	static void func(String str1,String str2,int str1count,int str2count,int counter){
		boolean flag = false;
		if(str1.charAt(str1count)==str2.charAt(str2count)){
			counter++;
			flag = true;
		}
		if(counter>count){
			count = counter;
		}
		if(flag && str1count!=0 && str2count!=0){
			func(str1,str2,str1count-1,str2count-1,counter);
		}
		else if(!flag && str1count!=0){
			func(str1,str2,str1count-1,str2count,counter);
		}
		if(!flag && str2count!=0){
			func(str1,str2,str1count,str2count-1,counter);
		}
	}
}