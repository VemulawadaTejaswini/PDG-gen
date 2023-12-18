import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static long[] list=new long[87];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  // String nyuA=sc.nextLine();
//  String nyuB=sc.nextLine(); 
 

   //String[] s=sc.nextLine().split(" ");
 //    String[] t=sc.nextLine().split("");

   String nyuA=sc.nextLine();


//int N=Integer.parseInt(nyuA);
//int A=Integer.parseInt(s[0]);
//int B=Integer.parseInt(s[1]);
//int C=Integer.parseInt(s[2]);

int X=Integer.parseInt(nyuA);
TreeSet<Long> set=new TreeSet<>();
for(int i=1;i<=X;i++){
long temp=i;
//System.out.println(2+"--");
for(int j=1;j<=X;j++){
temp*=i;

set.add(temp);
//System.out.println(temp+"-0-0-0");
if(temp>X)break;

}
}
ArrayList<Long> sets=new ArrayList<>(set);
long count=0;
for(Long t:sets){
//System.out.println(t);
if(X<=t)break;
count++;
}
try{
System.out.println(sets.get((int)count-1));
}catch(Exception e){}


}

}

