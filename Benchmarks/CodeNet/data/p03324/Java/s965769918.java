import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static long[] list=new long[87];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String[] nyuA=sc.nextLine().split(" ");
   
int D=Integer.parseInt(nyuA[0]);
int N=Integer.parseInt(nyuA[1]);

int cut=0;
for(int x=1;;x++){
if(func(x)==D){
cut++;
if(cut==N){
System.out.println(x);
break;
}//if
}//if

}//f

//System.out.println(data);
}
static int func(int x){
if(x%100 !=0) return 0;
return func(x/100)+1;
}

}

