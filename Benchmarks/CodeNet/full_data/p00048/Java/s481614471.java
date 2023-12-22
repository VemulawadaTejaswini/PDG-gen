import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
double weight;
while((line=br.readLine())!=null){
weight=Double.parseDouble(line);
classOfBoxing(weight);
}
}
private static void classOfBoxing(double n){
PrintWriter p=new PrintWriter(System.out);
if(n<=48.00){
p.println("light fly");
}
else if(n>48.00 &&n<=51.00){
p.println("fly");
}
else if(n>51.00 &&n<=54.00){
p.println("bantam");
}
else if(n>54.00 &&n<=57.00){
p.println("feather");
}
else if((n>57.00 &&n<=60.00){
p.println("light");
}
else if(n>60.00 &&n<=64.00){
p.println("light welter");
}
else if(n>64.00 &&n<=69.00){
p.println("welter");
}
else if(n>69.00 &&n<=75.00){
p.println("light middle");
}
else if(n>75.00 &&n<=81.00){
p.println("middle");
}
else if(n>81.00 &&n<=91.00){
p.println("light heavy");
}
else{
p.println("heavy");
}
}
}