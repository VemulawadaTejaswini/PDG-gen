import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int m=sc.nextInt();
  int ans=0;
  for(ans=m*10;ans<(m+1)*10;ans++){
    if((double)ans*0.08==n)break;
  }
  System.out.println((ans==(m+1)*10)?-1:ans);
}
}