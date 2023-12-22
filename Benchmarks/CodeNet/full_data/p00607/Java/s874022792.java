import java.io.*;
public class Main {
 public static void main(String[] args){
 try{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String str[];
  str=new String[101];
  String buffer="";
  String str2="";
  String str3="";
  int a;
  int j=0;
  while (true) {
   String str1 = br.readLine();
   if(str1.equals("END_OF_TEXT")){a=j; break;}
   str[j]=str1;
   j++;
  }
  int loc=0;
  int line=0;
  while(true) {
   System.out.print(loc);
   System.out.print(' ');
   System.out.println(line);
   for(int i=0;i<a;i++)
   System.out.println(str[i]);
   char ch=br.readLine().charAt(0);
   if(ch=='-') break;
   else if(ch=='a')loc=0;
   else if(ch=='e')loc=str[line].length()-1;
   else if(ch=='p'){
    loc=0;
    if(line!=0)line--;
   }
   else if(ch=='n'){
    loc=0;
    if(line!=a-1)line++;
   }
   else if(ch=='f'){
    if(loc!=str[line].length()-1)loc++;
    else if (loc==str[line].length()-1 && line!=a-1) {
     loc=0;
     line++;
    }
   }
   else if(ch=='b'){
    if(loc!=0)loc--;
    else if(loc==0 && line!=0)a=str[--line].length();
   }
   else if(ch=='d'){
    if(loc!=str[line].length()-1){
     str2=str[line].substring(0, loc)+str[line].substring(loc+1,str[line].length());
     str[line]="";
     str[line]+=str2;
    }
    else if(loc==str[line].length()-1 && line<a-1){
     str[line]+=str[line+1];
     str[line+1]="";
     for(int i=line+2;i<a;i++){
      str[i-1]+=str[i];
      str[i]="";
     }
     a--;
    }
   }
   else if(ch=='k'){
    if(loc!=str[line].length()-1) {
     buffer=str[line].substring(loc);
     str2=str[line].substring(0, loc);
     str[line]="";
     str[line]+=str2;
    } 
    else if(loc==str[line].length()-1 && line!=a-1){
     buffer="\n";
     for(int i=line+1;i<a;i++){
      str[i-1]+=str[i];
      str[i]="";
     }
     a--;
    }
   }
   else{
    if(buffer.equals("\n")) {
     str2=str[line].substring(loc,str[line].length());
     for(int i=a-1;i>line;i--){
      str[i+1]+=str[i];
      str[i]="";
     }
     str[line+1]+=str2;
     a++;
     loc=0;
     line++;
    }
    else if(buffer!="") {
     str2=str[line].substring(loc);
     str3=str[line].substring(0, loc);
     str[line]="";
     str[line]=str3+buffer+str2;
     loc=str[line].length()-1;
    }
   }
  }
  for(int i=0;i<a;i++)
  System.out.println(str[i]);
 }
 catch(Exception e){System.out.println("err");}
 }
}
