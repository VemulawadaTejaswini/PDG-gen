import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 
class Main {
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String moji=br.readLine();
     int n=Integer.parseInt(br.readLine());
     String str=null; 
     for(int i=0;i<n;i++){
    	 str=br.readLine();
    	
    	 String[] st=str.split(" ");
    	 int start=Integer.parseInt(st[1]);
    	 int end=Integer.parseInt(st[2]);
    	 if(st[0].equals("print"))System.out.println(moji.substring(start,end+1));
    	 else if(st[0].equals("replace")){
    		 if(start==0)moji=st[3]+moji.substring(++end);
    		 else moji=moji.substring(0,start)+st[3]+moji.substring(end+1);
    	 }
    	 else {String kari=moji.substring(start,end+1);
    	 String tmp=null;
    	 char[] ch=new char[kari.length()];
    	 for(int j=kari.length()-1;j>=0;j--){
    		 ch[j]=kari.charAt(j);
    		 tmp+=Character.toString(ch[j]);    		 
    	 }
    	 if(start==0)moji=tmp+moji.substring(end+1);
    	 else moji=moji.substring(0,start)+tmp+moji.substring(end+1);
    	 }
    	 
     }
     
    }}