import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		String word=in.nextLine(),str = in.nextLine()+" ";
		while(true) {
			String tstr=in.nextLine();
			if(tstr.equals("END_OF_TEXT"))break;
			str+=tstr+" ";
		}
		word=word.toUpperCase(); str=str.toUpperCase();
		
		String words[]=str.split(" ");
		//for(int i=0;i<words.length;i++)out.println(words[i]);
		int cnt=0;
		
		for(int i=0;i<words.length;i++) {
			if(words[i].equals(word))cnt++;
		}
		out.println(cnt);
		out.flush();
	}

}

