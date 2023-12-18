import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

//   String nyuA=sc.nextLine();
  // String nyuB=sc.nextLine();
 
      String[] S=sc.nextLine().split("");

//int n=Integer.parseInt(nyu);

//int N=Integer.parseInt(nyuA);
//int S=Integer.parseInt(nyuB);


//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);

//boolean[][] data=new boolean[H][W];

for(int i=0;i<S.length;i++){
if(S[i].equals("A"))break;
S[i]="0";
}
for(int i=S.length-1;i>0;i--){
if(S[i].equals("Z"))break;
S[i]="0";
}
int count=0;
for(int i=0;i<S.length;i++){
if(S[i].equals("0")){
}else{
//System.out.print(S[i]);
count++;
}
}
System.out.println(count);
	}
}