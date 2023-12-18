import java.lang.*;
import java.util.*;
import java.io.*;

public class Yakiniku{
    public String startsWithYaki(String s){
	String retStr = "No";
	if(s.substring(0,4).equals("YAKI")){
	    retStr = "Yes";
	}
	return retStr;
    }
    
    public static void main(String[] args){
       try{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	  String s = br.readLine();
	  Yakiniku yn = new Yakiniku();
	  String outStr = yn.startsWithYaki(s);
	  bw.write(outStr);
	  bw.newLine();
	  bw.flush();
       }catch(Exception e){
          e.printStackTrace();
       }
}

}
