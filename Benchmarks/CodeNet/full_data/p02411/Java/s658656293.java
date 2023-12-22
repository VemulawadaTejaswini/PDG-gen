import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		while(true) {
			int mid=in.nextInt(),fin=in.nextInt(),re=in.nextInt();
			if(mid==-1 && fin==-1 && re==-1)break;
			char jd;
			if(mid==-1 || fin==-1)jd='F';
			else if(mid+fin>=80)jd='A';
			else if(mid+fin>=65)jd='B';
			else if(mid+fin>=50)jd='C';
			else if(mid+fin>=30) {
				if(re>=50)jd='C';
				else jd='D';
			}
			else jd='F';
			out.println(jd);
		}
		out.flush();
	}

}

