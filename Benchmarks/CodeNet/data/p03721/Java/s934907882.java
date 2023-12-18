import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  long ans=0;
  long k=Long.parseLong(sc.next());
  for(int i=0;i<n;i++){
  	int po=sc.nextInt();
    ans+=sc.nextInt();
    if(ans>=k){System.out.println(po);break;}
  }}
}
