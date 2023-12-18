import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int n=0;
    int max=0;
    for(int i=0;i<str.length();i++){
     if(str.charAt(i)=='A'||'G'||'C'||'T'){
          n++;
     }else{
          n=0;
     }
     max=n>max?n:max;
     }
     System.out.println(num);
     }
    }