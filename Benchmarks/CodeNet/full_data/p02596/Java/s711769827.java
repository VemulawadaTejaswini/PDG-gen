import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();//,d=sc.nextInt(),f=0;
	int z=7,f=1;
	if(n%2==0){
      System.out.println("-1");
      return;
    }
    while(z>0 && z%n!=0){ z=z*10+7;f++;}
    System.out.println((z<0?"-1":f));
  }
}