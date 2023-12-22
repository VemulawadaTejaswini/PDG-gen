import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N=0;
    String Sentence;
    char Word[] = new char[100];
    int count[] = new int[26];
    char[] Alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    while(scanner.hasNext()){
      Sentence = scanner.next();
      Sentence = Sentence.toLowerCase();
      for(int i=0;i<Sentence.length();i++){
        Word[i] = Sentence.charAt(i);
        for(int j=0;j<26;j++){
          if(Word[i]==(Alpha[j])){
            count[j]++;
          }
      }
    }
  }

    for(int i=0;i<26;i++){
      System.out.println(Alpha[i] + " : " + count[i]);
    }


  }
}

