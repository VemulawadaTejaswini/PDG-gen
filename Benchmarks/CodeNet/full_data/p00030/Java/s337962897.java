import java.io.*;

class Main{
static int count;
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line;
while(!(line=br.readLine()).equals("0 0")){
String[] value=line.split(" ");
int n=Integer.parseInt(value[0]);
int s=Integer.parseInt(value[1]);
search(0,n,0,s);
System.out.println(count);
}
}
static void search(int i,int n,int sum,int s){
if(n==0){
if(sum==s){
count++;
return;
}
}
if(i>9){
return;
}
for(int a=i;a<=9;a++){
search(i+1,n-1,sum+a,s,count);
}
}
}