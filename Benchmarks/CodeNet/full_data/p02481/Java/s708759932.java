import java.io.*;
 
 class Main {
       public static void main (String[ ] args) throws IOException {
                 System.out.println("input line");
                          
                 BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
                 String str = input.readLine( );
                                                               
		 String[] ary = str.split(" ");
                 Integer a = new Integer(ary[0]);
		 Integer b = new Integer(ary[1]);
		 System.out.println(a*b +" "+(a+b)*2);
       }
 }