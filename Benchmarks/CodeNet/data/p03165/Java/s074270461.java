import java.util.*;
public class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
  String s=sc.next();
  String t=sc.next();
  String arr[][]=new String[t.length()+1][s.length()+1];
  for(int j=0;j<=s.length();j++)
  arr[0][j]="";
  
  for(int j=0;j<=t.length();j++)
  arr[j][0]="";
  
  for(int i=1;i<=t.length();i++){
  for(int j=1;j<=s.length();j++){
  if(arr[i-1][j].length()<j&&s.charAt(j-1)==t.charAt(i-1)){
  arr[i][j]=arr[i-1][j-1]+Character.toString(s.charAt(j-1));
  }
  else{
      arr[i][j]=(arr[i-1][j].length()>arr[i][j-1].length())? arr[i-1][j] : arr[i][j-1];
  }
  }
  }

  System.out.println(arr[t.length()][s.length()]);
}
}