import java.io.*;
class Main{
public static void main(String[] args)throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in);
String str=br.readLine();
int n=Integer.parseInt(n);
String str2=br.read();
String[] arr=str2.split(" ");
String[] rev =new String[n];
for(int i=0; i<n; i++){
rev[i]=arr[n-i-1];
System.out.print(rev[i]);
if(i !=n-1)  System.out.print(" ");
}
br.close();
}
} 