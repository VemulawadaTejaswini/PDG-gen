import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] STRINGS = new String[3];
    for(int i=0; i<3; i++){
      STRINGS[i] = scanner.next();
    }
    scanner.close();

    int[] index = new int[3];
    int turn = 0;
    char[] ans = {'A', 'B', 'C'};
    boolean isEnd = false;
    while(!isEnd){
      index[turn]++;
      for(int i=0; i<3; i++){
        if(index[i] == STRINGS[i].length()+1){
          System.out.println(ans[i]);
          isEnd = true;
          break;
        }
      }
      if(isEnd){
        break;
      }
      switch(STRINGS[turn].charAt(index[turn]-1)){
        case 'a':
          turn = 0;
          break;
        case 'b':
          turn = 1;
          break;
        case 'c':
          turn = 2;
          break;
      }
    }
  }
}
