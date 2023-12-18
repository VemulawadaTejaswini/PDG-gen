import java.util.*;
public class Main {
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long a=sc.nextInt();
	long b=sc.nextInt();
	
	long c=GCD(a,b);
	
	List<Long> p = new LinkedList<Long>();
	p.add(1L);
	long tmp=1,ii=2;
	while(!isPrime(c)){
		for(long i=ii;i<=c/2;i++){
			if(c%i==0){
				c=c/i;
				if(tmp!=i)p.add(i);
				tmp=i; ii=tmp;
				break;
			}
		}
	}if(p.indexOf(c)==-1)p.add(c);

	System.out.println(p.size());
 }
 
  public static boolean isPrime(long n){//素数かどうか
	if(n<3)return n>0?true:false;
    long m=n/2;
	if(m<2)return true;
	if(n%m==0)return false;
	m=(long)Math.floor(Math.sqrt((double)n));
	while(m>2){
		if(n%m==0)return false;
		m--;
	}
	return true;
  }
  
  public static long GCD(long x,long y){//最大公約数
	 long tmp;
	 if(y>x){tmp=x;x=y;y=tmp;}
     while((tmp=x%y)!=0){x=y;y=tmp;}
	 return y;
 }

}