import java.io.*;
class Main{
 public static void main(String[] args)throws IOException{

InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);

String check = br.readLine();
int count = 0;

while(true){
String str = br.readLine();
int space1 = 0;
int space2 = 0;

while(true){

if(space1 == 0){
space2 = str.indexOf(" ");
String str1;
if(space2 != -1)
 str1 = str.substring(space1, space2);
else
 str1 = str.toString();
 if(check.equals(str1)){
  count++;
 }
if(space2 == -1) break;
space1 = space2;
}

else{
space1 = space2;
space2 = str.indexOf(" ", space2+1);
String str1;
if(space2 == -1){
 str1 = str.substring(space1+1, str.length());
}
else{
 str1 = str.substring(space1+1, space2);
}
 if(check.equals(str1)){
  count++;
}
 if(space2 == -1)
  break;

}
}
if(str.equals("END_OF_TEXT"))
 break;
}
System.out.println(count);

}
}