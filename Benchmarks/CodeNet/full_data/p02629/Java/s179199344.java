import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String o="";
        long n=sc.nextLong();
		while(n>0){
          	long a=n%26;
          	if(a!=0)o=(char)(96+a)+o;
          	else o="z"+o;
          	n=n/26;
          	if(a==0)n--;
        }
        
      System.out.println(o);
    }
    
}