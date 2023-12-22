import java.io.*;
import java.util.*;

class Dice{
	String face1;
	String face2;
	String face3;
	String face4;
	String face5;
	String face6;
	
	Dice(String a1,String a2,String a3,String a4,String a5,String a6){
		this.face1= a1;
		this.face2= a2;
		this.face3= a3;
		this.face4= a4;
		this.face5= a5;
		this.face6= a6;
	}
	
	void roll(char c){
		if( c=='N' ){
			String buf1= this.face1;
			String buf2= this.face2;
			String buf6= this.face6;
			String buf5= this.face5;
			
			this.face1= buf2;
			this.face2= buf6;
			this.face6= buf5;
			this.face5= buf1;
		}
		else if( c=='S' ){
			String buf1= this.face1;
			String buf2= this.face2;
			String buf6= this.face6;
			String buf5= this.face5;
			
			this.face1= buf5;
			this.face2= buf1;
			this.face6= buf2;
			this.face5= buf6;
		}
		else if( c=='E' ){
			String buf1= this.face1;
			String buf4= this.face4;
			String buf6= this.face6;
			String buf3= this.face3;
			
			this.face1= buf4;
			this.face4= buf6;
			this.face6= buf3;
			this.face3= buf1;
		}
		else if( c=='W' ){
			String buf1= this.face1;
			String buf4= this.face4;
			String buf6= this.face6;
			String buf3= this.face3;
			
			this.face1= buf3;
			this.face4= buf1;
			this.face6= buf4;
			this.face3= buf6;
		}
	}
}

public class Main{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] pip = str.split(" ");
		Dice dice= new Dice(pip[0],pip[1],pip[2],pip[3],pip[4],pip[5]);
		
		str= br.readLine();
		int i;
		for(i=0;i<str.length();i++){
			dice.roll(str.charAt(i));
		}
		
		System.out.println(dice.face1);
	}
}