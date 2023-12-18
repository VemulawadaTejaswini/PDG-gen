import java.util.Scanner;

class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int num=2019;
    
    String s2;
    int count=0;
    for(int i=1;i<=10;i++){
      s2=Integer.toString(num*i);
      if(s.contains(s2))
        count++;
      
    }
    System.out.println(count);
  }
}
