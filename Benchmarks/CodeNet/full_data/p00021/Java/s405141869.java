import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
int n=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++){
str=br.readLine();
String[] s=str.split(" ");
double x1=Double.parseDouble(s[0]);
double y1=Double.parseDouble(s[1]);
double x2=Double.parseDouble(s[2]);
double y2=Double.parseDouble(s[3]);
double x3=Double.parseDouble(s[4]);
double y3=Double.parseDouble(s[5]);
double x4=Double.parseDouble(s[6]);
double y4=Double.parseDouble(s[7]);
if((x1-x2)*(y3-y4)==(y1-y2)*(x3-x4)){
System.out.println("YES");
}
else{
System.out.println("NO")
}
}
}
}