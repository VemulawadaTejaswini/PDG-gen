import java.util.*;
import java.math.*;

public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
	Integer[] data=new Integer[n];
	BigInteger t;
    BigInteger sum=BigInteger.valueOf(0);
	BigInteger doubled=BigInteger.valueOf(0);
    for(int i=0;i<data.length;i++){
      data[i]=sc.nextInt();
      t=BigInteger.valueOf(data[i]);
      sum=sum.add(t);
      doubled=doubled.add(t.multiply(t));
    }
    BigInteger multied=sum.multiply(sum);
    multied=multied.subtract(doubled).divide(BigInteger.valueOf(2)).mod(BigInteger.valueOf(1000000007));
    
    System.out.println(multied.intValue());
    
    
  }
}