import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static ArrayList<Integer[]> list=new ArrayList<>();
static ArrayList<Integer[]> set=new ArrayList<>();


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String nyuA=sc.nextLine();
   String nyuB=sc.nextLine();
 
    String[] s=sc.nextLine().split(" ");
//     String[] e=sc.nextLine().split(" ");

//int N=Integer.parseInt(nyuA);

int N=Integer.parseInt(nyuA);
int K=Integer.parseInt(nyuB);


int[] num=new int[s.length];
for(int i=0;i<s.length;i++){
num[i]=Integer.parseInt(s[i]);
//System.out.println(num[i]+"-2");
}
int res=0;
for(int i=0;i<N;i++){
int tem=Math.min(K-num[i],num[i])*2;
//System.out.println(K-num[i]+"---"+num[i]+"-3");

res+=tem;
}

System.out.println(res);



	}

}