import java.io.*;
import java.util.*;
public class Main {
 public static void main(String[] args)throws IOException{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  while(true){
   int f=0;
   String str4[]=new String[100];  
   str4=br.readLine().split(" ");
   String str1=str4[0];
   String str2=str4[1]; 
   String str3[]=new String[100];
   char ch=str2.charAt(0);
   int n=str1.indexOf("_");
   //原文の判定
   if(n>=0){
    str3=str1.split("_");
    f=2;
    }
   else if(Character.isUpperCase(str1.charAt(0)))f=1;
   String str="";
//規則の判定
  
   if(ch=='X')break;
   else if(ch=='U'){
   //変換
    if(f==0)str=str1.substring(0,1).toUpperCase()+str1.substring(1);
    else if(f==2){
     for(int i=0;i<str3.length;i++)
      str+=str3[i].substring(0,1).toUpperCase()+str3[i].substring(1);
    }
    else str=str1;
   }
   else if(ch=='L'){
   //変換
    if(f==0)str=str1;
    else if(f==1)str=str1.substring(0,1).toLowerCase()+str1.substring(1);
    else if(f==2){
     str+=str3[0];
     for(int i=1;i<str3.length;i++)
      str+=str3[i].substring(0,1).toUpperCase()+str3[i].substring(1);
    }
   }
   else if(ch=='D') {
   //変換
    str1=str1.substring(0,1).toLowerCase()+str1.substring(1);
    int idx=0;
    for(int i=0;i<str1.length();i++){
     if(Character.isUpperCase(str1.charAt(i))){
      str+=str1.substring(idx,i)+"_"+str1.substring(i,i+1).toLowerCase();
      idx=i+1;
     }
}
    str+=str1.substring(idx);
      }
  System.out.println(str);
  }
 }
}
