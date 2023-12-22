import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
public class Main{
	
	public static void main(String[]args) {
		PrintWriter out = new PrintWriter(System.out);
		Scanner sc=new Scanner (System.in);
		int mod = sc.nextInt();
      	int val = 7%mod;
      	for(int i =1;i<1e7; i++){
         	if(val==0){
              	out.println(i);
          		return;
            }
          	val = (val*10+7)%mod;
  
          
        }
      
      	out.println("-1");
		out.close();
	}
}