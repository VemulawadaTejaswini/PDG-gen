import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    int N = S.length();
    int count = 0;
    char [] input = new char[N];
    for(int i=0;i<N;i++){
      input[i] = S.charAt(i);
    }
    for(int j=1;j<N+1;j++){
      if(j%2==0){
        if(input[j-1]=='L'|| input[j-1]=='U'|| input[j-1]=='D'){
          count++;
        }
      }
      else{
        if(input[j-1]=='R'|| input[j-1]=='U'|| input[j-1]=='D'){
          count++;
        }
      }
    }
    if(count==N){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
