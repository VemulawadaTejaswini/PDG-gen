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
      for( k = 0; k < i; k++){
        if(S[i].equals(S[k])){
          break;
        }else{
          if(k == i-1){
            counter++;
          }
        }
    }
    k = 0;
    }
    System.out.println(counter);
  }

  }
