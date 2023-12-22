import java.io.*;
class Main{
public static void main(String[] args)throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str=br.readLine();
int n=Integer.parseInt(str);
int[][] tramp=new int[4][13];
for(int i=0; i<n; i++){
String str2=br.readLine();
String[] card=str2.split(" ");
int c=Integer.parseInt(card[1]);
switch(card[0]){
case "S": tramp[0][c]=1; break;
case "H": tramp[1][c]=1; break;
case "C": tramp[2][c]=1; break;
case "D": tramp[3][c]=1; break;
}
}
for(int j=0; j<4; j++){
for(int k=0; k<13; k++){
if(card[j][k]==0)  printCard(j, k);
}
}
System.out.println();
br.close();
}
static void printCard(int suit, int num){
switch(suit){
case 0: System.out.println("S "+num); break;
case 1: System.out.println("H "+num); break;
case 2: System.out.println("C "+num); break;
case 3: System.out.println("D "+num); break;
default: break;
}
}
} 