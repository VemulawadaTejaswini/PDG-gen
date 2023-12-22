import java.util.Scanner;
import java.util.HashSet;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    HashSet <String> hs = new HashSet<String>();
    int N = scanner.nextInt();
    int A[] = new int[1000000];
    int n=0;
    String Command,Word;

    for(int i=0;i<N;i++){
      Command = scanner.next();
      if(Command.equals("insert")){
        Word = scanner.next();
        hs.add(Word);
      }else{
        Word = scanner.next();
        if(hs.remove(Word)){
          hs.add(Word);
          A[n] = 1;
          n++;
        }else{
          n++;
        }
      }
    }

    for(int i=0;i<n;i++){
      if(A[i]==0){
        System.out.println("no");
      }else{
        System.out.println("yes");
      }
    }

  }
}

