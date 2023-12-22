import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  int y=sc.nextInt();
  boolean v=false;
  for(int i=1;i<=x;i++){
		int c=i*2+(x-i)*4;
    if(c==y){
      v=true;
      System.out.println("YES");
    }
  }
  if(v==false){
System.out.println("NO");
  }
}
}