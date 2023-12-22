import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] args)throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String str1 = new String(br.readLine());
	String str2 = new String(br.readLine());
	//read
      	BigInteger bi1 =new  BigInteger(str1);
	BigInteger bi2=new BigInteger(str2);
	//bigint に変換
	BigInteger sum = bi1.add(bi2);
	String l = sum.toString();
	if(l.length()>80){
	    System.out.printf("overflow");
	}
	else
	    System.out.println(l);
	str1=br.readLine();

	//1回目
	while(str1!=null){
	    str2=br.readLine();
	    
	    bi1 = new BigInteger(str1);
	    bi2 = new BigInteger(str2);
	    
	    sum = bi1.add(bi2);
	    l = sum.toString();
	    if(l.length()>80){
		System.out.printf("overflow");
	    }
	    else
		System.out.println(l);
	    str1=br.readLine();
	    
	}
    }
    
}
    
	    