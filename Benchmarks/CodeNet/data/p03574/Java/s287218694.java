import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static ArrayList<Integer[]> list=new ArrayList<>();
static ArrayList<Integer[]> set=new ArrayList<>();


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

//   String nyuA=sc.nextLine();
 //  String nyuB=sc.nextLine();
 
    String[] s=sc.nextLine().split(" ");
//     String[] e=sc.nextLine().split(" ");

//int N=Integer.parseInt(nyuA);

int H=Integer.parseInt(s[0]);
int W=Integer.parseInt(s[1]);


String[][] num=new String[H][W];
int[][] min=new int[H][W];

for(int i=0;i<H;i++){
num[i]=sc.nextLine().split("");
}

for(int i=0;i<H;i++){
for(int j=0;j<W;j++){
if(num[i][j].equals("#"))min[i][j]=24;
else{
int count=0;
for(int k=-1;k<=1;k++){
for(int l=-1;l<=1;l++){
try{
if(num[i+k][j+l].equals("#") && !(k==0 && l==0)){
count++;
}

}catch(Exception e){}

}
}
min[i][j]=count;

}//else

}}


for(int i=0;i<H;i++){
for(int j=0;j<W;j++){
if(min[i][j]==24)
System.out.print("#");
else
System.out.print(min[i][j]);

//if(j!=W-1)System.out.print(" ");
}
System.out.println();
}


	}

}