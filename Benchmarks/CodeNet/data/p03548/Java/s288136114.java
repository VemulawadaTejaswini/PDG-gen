import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static ArrayList<Integer[]> list=new ArrayList<>();
static ArrayList<Integer[]> set=new ArrayList<>();


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  // String nyuA=sc.nextLine();
 //  String nyuB=sc.nextLine();
 
 //   String[] s=sc.nextLine().split(" ");
     String[] e=sc.nextLine().split(" ");

int X=Integer.parseInt(e[0]);

int Y=Integer.parseInt(e[1]);
int Z=Integer.parseInt(e[2]);
int res=0;
X-=Z;
while(true){
if(X>=Y){
res++;
X-=Y;
}else{
break;
}

if(X<Z){
res--;
}else if(X>=Z){
X-=Z;
}

}//while


System.out.println(res);


	}

}