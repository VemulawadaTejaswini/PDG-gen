import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cost = Integer.parseInt(sc.next());
    int dislike = Integer.parseInt(sc.next());
    int[] numbers = new int[10];
    for(int i=0; i<dislike; i++){
      numbers[Integer.parseInt(sc.next())] = 1;
    }
    int[] likeNumbers = new int[10-dislike];
    int j = 0;
    for(int i=0; i<10; i++){
      if(numbers[i] != 1){
        likeNumbers[j] = i;
        j++;
      } 
    }
    
    j = 0;
    while(true){
      if(cost/Math.pow(10, j) != 0){
        j++;
      }else{
        break;
      }
    }
    
    int pay = 0;
    for(int i=0; i<j; i++){
      pay += Math.pow(likeNumbers[9-dislike], j-i);
    }
    if(cost == pay){
      System.out.println(pay);
    }
    
    for(int s=j; 0<=s; s--){
      for(int t=0; t<9; t++){
        if(pay%Math.pow(10, s)+likeNumbers[9-dislike-t] < cost){
          pay = pay%Math.pow(10, s)+likeNumbers[9-dislike-t+1]*Math.pow(10, s);
          break;
        }
      }
    }
    System.out.println(pay);
  }
}