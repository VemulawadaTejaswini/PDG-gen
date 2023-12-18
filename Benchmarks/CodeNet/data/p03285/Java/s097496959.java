import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {



	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);


String S=sc.nextLine();
int N=Integer.parseInt(S);

int big=N/7 +1;
int flag=0;
for(int i=0;i<=7;i++){
for(int j=0;j<=7;j++){
if(4*i+7*j==N){
flag=1;
break;
}
}

}

if(flag==0)
System.out.println("No");
else
System.out.println("Yes");


}

}

