import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  int y=sc.nextInt();
  boolean v=false;
  for(int i=1;i<=x;i++){
		int c=i*2+(x-i)*4;
    int d=i*2;
    int e=(x-i)*4;
    int ds=x*4;
    if(y!=0&&(c==y||d==y||e==y||ds==y)){
      v=true;
      System.out.println("Yes");
      break;
    }
  }
  if(v==false){
System.out.println("No");
  }
}
}