import java.io.*;
class Main{
public static void main(String[] args)throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str=br.readLine();
int n=Integer.parseInt(str);
int[] Scard=new int[13];
int[] Hcard=new int[13];
int[] Ccard=new int[13];
int[] Dcard=new int[13];
for(int i=0; i<n; i++){
String str2=br.readLine();
String[] card=str2.split(" ");
switch(card[0]){
case "S": Scard=numCheck(card[1],Scard);
          break;
case "H": Hcard=numCheck(card[1],Hcard);
          break;
case "C": Ccard=numCheck(card[1],Ccard);
          break;
case "D": Dcard=numCheck(card[1],Dcard);
          break;
default: break;
}
}
cardPrint(Scard,"S");
cardPrint(Hcard,"H");
cardPrint(Ccard,"C");
cardPrint(Dcard,"D");
System.out.println();
br.close();
}
static int[] numCheck(String num,int[] arr2){
int c=Integer.parseInt(num);
arr2[c]=1;
return arr;
}
static void cardPrint(int[] tramp, String suit){
for(int j=0; j<13; j++){
if(int[j]==0)  System.out.println(suit+" "+j);
}
}
} 