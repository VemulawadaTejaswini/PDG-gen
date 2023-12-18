import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static long[] list=new long[87];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String[] nyuA=sc.nextLine().split(" ");
   
int a=Integer.parseInt(nyuA[0]);
int b=Integer.parseInt(nyuA[1]);

int[] num=new int[1000];

int count=0;
for(int i=1;i<=999;i++){
count+=i;
num[i-1]=count;
}


System.out.println(num[b-a-2]-a);
}

}

