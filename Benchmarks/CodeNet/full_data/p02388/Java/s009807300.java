import java.io.*;
class Main {
	public static void main(String[] args){
  int x;
  int y = 0;
    System.out.print("input integer:");
     InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
  
  try{
  	String buf = br.readLine();
  	x = Integer.parseInt(buf);
      y = x * x * x;
  }
  	catch(Exception e){
  		x = 100;
  		x = 0;
  		}
  		System.out.println(y);
  		}
  		}