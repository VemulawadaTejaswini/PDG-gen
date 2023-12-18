import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int count = 0;
      
    for(int i = 0; i < S.length() - 2; i++){
    if(S.charAt(i) != 'A') continue;
    else if(S.charAt(i + 1) != 'B') continue;
    else if(S.charAt(i + 2) != 'C') continue;
      
    count++;     
    }  
      
    }
}