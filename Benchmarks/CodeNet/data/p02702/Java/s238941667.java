import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Long A = sc.nextLong();
    int L =  String.valueOf(A).length();   
    String S = A.toString();  
    int c = 0;
    for (int i=0; i < L -3; i++) {
      for (int j=i+3; j < L; j++) {
        String tmp = S.substring(i, j+1);
        if(Long.parseLong(tmp)%2019==0){
          c++;
        }
      }

    }
    System.out.println(c);
    return;
  }
  
}

