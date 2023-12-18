import java.util.Scanner;
class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] S = new String[n];
    int i = 0;
    int k = 0;
    int counter = 1;
    for( i = 0; i < n; i++){
      S[i] = sc.next();
      if(i >= 1){
      for( k = i-1; k < i; k++){
        if(S[i].equals(S[k])){
          continue;
        }else{
          counter++;
        }
      }
      k = 0;
    }
  }
    System.out.println(counter);

  }
}
