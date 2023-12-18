import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int counter = sc.nextInt();
    int[] array = new int[counter];
    int[] fake = new int[counter];
    int ave = 0;
    for(int i = 0;i<counter;i++){
      array[i] = sc.nextInt();
      fake[i] = array[i] - i-1;
      ave += fake[i];
    }
    int ceilAve = (int)Math.floor((double)ave/(double)counter);
    int floorAve= (int)Math.ceil((double)ave/(double)counter);
    int answer= 0;
    
    for(int i = 0;i<counter;i++){
      answer += Math.abs(array[i] - (ceilAve+i+1));
    }
    int ans=0;
    for(int i = 0;i<counter;i++){
      ans += Math.abs(array[i] - (floorAve+i+1));
    }
    if(ans<answer) answer = ans;
    System.out.println(answer);
  }
}