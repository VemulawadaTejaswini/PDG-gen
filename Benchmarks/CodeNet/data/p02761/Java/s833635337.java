import java.util.*; 
import java.io.*;

class Main {

  public static String StringPeriods(String str) {
    boolean flag = false;
    String ans = "";
    for(int i=0;i<str.length();i++){
      String temp = str;
      String substr = str.substring(0,i);
      temp = temp.replaceAll(substr, "");
      if(temp.equals("")) {
    	  flag = true;
    	  ans = substr;
    	  break;
      }
    }
    if(flag) {
    	str = ans;
    }else {
    	str = "-1";
    }
    // code goes here  
    return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner sc = new Scanner(System.in);
   int N;
    N=sc.nextInt();
   int M;
   M = sc.nextInt();
   int[] s=new int[M];
   String[] c=new String[M];
   String[] ch = new String[N];
   for(int i=0;i<N;i++) {
	   ch[i] = "0";
   }
   boolean flag = true;
   for(int i=0;i<M;i++) {
	   s[i]=sc.nextInt();
	   c[i]=sc.next();
	   if(ch[s[i]-1].equals("0")||ch[s[i]-1].equals(c[i])) {
		   ch[s[i]-1] = c[i];
	   }else {
		   flag = false;
	   }
    }
   
   if(N>1&&ch[0].equals("0")) {
	   flag=false;
	   
   }
   if(flag) {
	   String result="";
	   for(int i=0;i<N;i++) {
		   result+=ch[i];
	   }
	   System.out.println(result);
   }else {
	   
	   System.out.println(-1);
   }
   
  }

}