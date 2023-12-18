import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
	String[] a=sc.nextLine().split(" ");
	int N=Integer.parseInt(a[0]);
	int K=Integer.parseInt(a[1]);
	long[] num=new long[N];
	
	String[] temp=sc.nextLine().split(" ");
	for(int i=0;i<N;i++){
	num[i]=Long.parseLong(temp[i]);
	}
ArrayList<BigInteger> list=new ArrayList<>();
for(int i=0;i<N;i++){
for(int j=i+1;j<N;j++){
BigInteger an=new BigInteger(num[i]+"");
BigInteger b=new BigInteger(num[j]+"");

list.add(an.multiply(b));
}
}
Collections.sort(list);	
System.out.println(list.get(K-1).toString());
    }

}