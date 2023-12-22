import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
for(int i=0;i<Integer.parseInt(br.readLine());i++){
String[] values=br.readLine().split(" ");
double x1=Double.parseDouble(values[0]);
double y1=Double.parseDouble(values[1]);
double x2=Double.parseDouble(values[2]);
double y2=Double.parseDouble(values[3]);
double x3=Double.parseDouble(values[4]);
double y3=Double.parseDouble(values[5]);
double x4=Double.parseDouble(values[6]);
double y4=Double.parseDouble(values[7]);
if(x1==x2&&x3==x4){
System.out.println("YES");
}
else if(y1==y2&&y3==y4){
System.out.println("YES");
}
else if((x1-x2)*(y3-y4)==(y1-y2)*(x3-x4)){
System.out.println("YES");
}
else{
System.out.println("NO");
}
}
}
}