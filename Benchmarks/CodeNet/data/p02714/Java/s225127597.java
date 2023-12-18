import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int count = 0;
    for(int i = 0; i<N-2;i++){
      char c1 = S.charAt(i);
      loop2: for(int j = i + 1; j< N-1 ; j++){
        char c2 = S.charAt(j);
        if(c1==c2){
          continue loop2;
        }
        loop3:for(int k = j + 1; k< N ; k++){
          // System.out.println(k);
          char c3 = S.charAt(k);
          if(c2==c3 || c3 ==c1 || k - j == j -i ){
            continue loop3;
          }
          count++;
        }
      }
    }
    System.out.println(count);
  }

  
}


