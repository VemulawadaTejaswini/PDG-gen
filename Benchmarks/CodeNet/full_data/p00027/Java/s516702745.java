import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
while(!(str=br.readLine()).equals("0 0")){
String[] value=str.split(" ");
int m=Integer.parseInt(value[0]);
int d=Integer.parseInt(value[1]);
System.out.println(dayOfdate(m,d));
}
}
static String dayOfdate(int m,int d){
int[] md={31,29,31,30,31,30,31,31,30,31,30,31};
if(m!=1){
for(int i=0;i<m-1;i++){
d+=md[i];
}
}
if(d%7==1){return "Thursday";}
else if(d%7==2){return "Friday";}
else if(d%7==3){return "Saturday";}
else if(d%7==4){return "Sunday";}
else if(d%7==5){return "Monday";}
else if(d%7==6){return "Tuesday";}
else{return "Wednesday";}
}
}