import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int k=sc.nextInt();
  int index=0;
  int ans=0;
  for(int i=0;i<n;i++){
    ans=sc.nextInt();
  	index+=sc.nextInt();
    if(index>=k)break;
  }
  System.out.println(ans);
  
  
  
  
  
}

}