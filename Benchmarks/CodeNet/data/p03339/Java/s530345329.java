import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int counter = sc.nextInt();
    int[] member = new int[counter];
    char[] memchar = sc.next().toCharArray();
    
    for(int i = 0;i<counter;i++){
      member[i] = (memchar[i] == 'E')?0:1;
    }
    
    int answer = 300000;
    for(int i = 0;i<counter;i++){
      int tempAnswer = 0;
      if(i!=0){
        for(int j = 0;j<i-1;j++){
          if(member[j] == 1)
            tempAnswer++;
        }
      }
      if(i!=counter-1){
        for(int j = i +1;j<counter;j++){
          if(member[j] == 0)
            tempAnswer++;
        }
      }
      if(tempAnswer < answer) answer = tempAnswer;
    }
    System.out.println(answer);
  }
}