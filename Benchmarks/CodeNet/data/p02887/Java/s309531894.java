import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int N=sc.nextInt();
    char[] s=sc.next().toCharArray();
    int sum=N;
    for(int i=0;i<N-1;i++){
      if(s[i]==s[i+1]){
        sum--;
      }
    }
    System.out.println(sum);
  }
}