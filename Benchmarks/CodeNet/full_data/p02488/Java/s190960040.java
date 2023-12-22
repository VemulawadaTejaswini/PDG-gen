import java.util.Scanner;

public class Main{
 public static void main(String[] args){
 
  /*sc:for scan, n :the number of string to scan*/
  Scanner sc= new Scanner(System.in);
  int n= sc.nextInt();

  /*Make n string (store)*/
  String[] str=new String[n];
  /*str_first:The 1st word in dictionary. default value:0*/
  String str_first =" ";
  
  /*Repeat scanning n strings & search the 1st word in dictionary*/
  for(int i=0;i<n;i++){
   str[i]=sc.next(); 
   
   /*Default:Anyway str[i] stores in str_first. Other:if str[i] appears
    earlier than the temporary str_first,str[i] stores in str_first.*/
   if(str_first.equals(" "))
    str_first=str[i];
   else{
    if(str_first.compareTo(str[i])>0)   //compare which is earlier in dic.
     str_first=str[i];
   }
  }  

  /*Print out the result*/
  System.out.println(str_first);  

  }
}
  