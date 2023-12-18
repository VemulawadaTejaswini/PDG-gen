import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {



	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);


String[] S=sc.nextLine().split(" ");
int X=Integer.parseInt(S[0]);
int Y=Integer.parseInt(S[1]);
boolean[] goodx=new boolean[110];
boolean[] goody=new boolean[110];

String[] board=new String[110];

for(int i=0;i<X;i++){
board[i]=sc.nextLine();
}
for(int i=0;i<X;i++){
for(int j=0;j<Y;j++){
String[] temp=board[i].split("");
if(temp[j].equals("#")){
goodx[i]=true;
goody[j]=true;
}
}
}
for(int i=0;i<X;i++){
if(goodx[i]){
for(int j=0;j<Y;j++){
if(goody[j]){
String[] tem=board[i].split("");
System.out.print(tem[j]);
}
}
System.out.println();
}



}

}




}



