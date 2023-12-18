import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int counter = sc.nextInt();
    int member = sc.nextInt();
    int[] box = new int[counter];
    
    for(int i= 0;i<counter;i++){
      box[i] = sc.nextInt();
    }
    
    long answer = 0;
    
    for(int i = 0;i<counter;i++){
      long sum = 0;
      for(int j = i;j<counter;j++){
        sum += box[j];
        if(sum % member ==0){
          answer++;
        }
      }
    }
    System.out.println(answer);
  }
}