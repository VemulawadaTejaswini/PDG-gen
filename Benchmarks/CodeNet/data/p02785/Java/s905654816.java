import java.util.Scanner;
import java.util.*;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
long n=scan.nextLong();
long k=scan.nextLong();  
long[] h=new long[n];

long i=0;  
for(i=0;i<n;i++){
    h[i]=scan.nextLong();
}
  
Arrays.sort(h);
  
long sum=0;

if(n>k){
    for(i=0;i<n-k;i++){
      sum=sum+h[i];
    }
System.out.println(sum); 
}else{
  System.out.println("0");
}


}
}
