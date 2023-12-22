import java.util.Scanner;
class acm{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
  int x= Integer.parseInt(sc.nextLine());
  String [] p= new String[x];
  for(int i = 0 ; i<x;i++){
  String [] s= (sc.nextLine().split(" "));
  int a = Integer.parseInt(s[0]);
  int b = Integer.parseInt(s[1]);
  int c = Integer.parseInt(s[2]);
  
    if((a*a==b*b+c*c)|| (b*b==a*a+c*c)||(c*c==a*a+b*b)){
      p[i]="YES";
    }else{
      p[i]="NO";
    }
  }
    for( String s : p)
      System.out.println(s);
  }
}