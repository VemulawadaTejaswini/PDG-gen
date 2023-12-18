import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int numOfBooks = sc.nextInt();
    int alg = sc.nextInt();
    int goal = sc.nextInt();
    int[] price = new int[numOfBooks];
    int[][] understanding = new int[numOfBooks][alg];
    int[] understanding2 = new int[alg];

    for(int i=0; i<numOfBooks; i++){
      price[i] = sc.nextInt();
      for(int j=0; j<alg; j++){
        understanding[i][j] = sc.nextInt();
        understanding2[j] += understanding[i][j];
      }
    }

    //目標が達成できるか確かめる
    int[] canGoal = Arrays.stream(understanding2).filter(num -> num >= goal).toArray();
    if(canGoal.length != understanding2.length){
      System.out.println("-1");
      return;
    }
  }
}
