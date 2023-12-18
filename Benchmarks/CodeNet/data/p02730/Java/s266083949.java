import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  char c[]=sc.next().toCharArray();
  int n=c.length;
  boolean b=true;
  for(int i=0;i<n/2;i++){
    if(c[i]!=c[n-1-i])b=false;
  }
  for(int i=0;i<(n/2)/2;i++){
    if(c[i]!=c[n/2-i-1])b=false;
  }
  System.out.println(b?"Yes":"No");
}
}
