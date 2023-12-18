import java.util.*;
class Main {
  Scanner sc = new Scanner(System.in);
  int pw = sc.next();

  public static void main(String args[]){
    for(int i=0; i < pw.length()-1; i++) {
      if (pw.substring(i, i+1).equals(pw.substring(i+1, i+2))){
        return 'Bad';
      }
    }
    return 'Good';
  }
}