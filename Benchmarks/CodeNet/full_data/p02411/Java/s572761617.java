import java.io.*;
class Main{
public static void main(String[] args)throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int[][] sum = new int[100000][3];
int a=0;
while(true){
a++;
String x=br.readLine();
String y=br.readLine();
String z=br.readLine();
sum[a][0]=Integer.parseInt(x);
sum[a][1]=Integer.parseInt(y);
sum[a][2]=Integer.parseInt(z);
if(sum[a][0]==-1&&sum[a][1]==-1&&sum[a][2]==-1)
break;


}
int S;
for(int b=0;b<a;b++){
S=sum[b][0]+sum[b][1];
if(sum[b][0]==-1||sum[b][1]==-1){
if(S>=80)
System.out.println("A");
else if(S>=65)
System.out.println("B");
else if(S>=50)
System.out.println("C");
else if(S>=30&&sum[b][2]>=50)
System.out.println("C");
else if(S>=30)
System.out.println("D");
else
System.out.println("F");
}
else
System.out.println("F");

}
}
}