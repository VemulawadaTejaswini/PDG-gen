import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    int N=sc.nextInt();
    String s=sc.next();
    int count=0;
    for(int i=0; i<N; i++){
     if(s.charAt(i)=='I'){
      count++;
     }else if(s.charAt(i)=='D'){
      count--;
     }
    }
    System.out.println(count);
  }
}