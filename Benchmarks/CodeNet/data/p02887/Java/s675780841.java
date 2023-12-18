import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();

    int count = 0;

    for(int i=0; i<n; i++){
      if(c[i] == c[i+1]){
        count++;
      }
    }
  }
}
