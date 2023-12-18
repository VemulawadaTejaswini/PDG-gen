import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] card = new int[num];
    int alice = 0;
    int bob = 0;
    for(int i = 0; i < num; i++){
      card[i] = sc.nextInt();
    }
    Arrays.sort(card);
    for (int i = (num-1); i>=0; i-=2){
      alice += card[i];
    }
    for (int j = (num-2); j>=0; j-=2){
     bob += card[j];	
    }
    int division = alice - bob;
    System.out.println(division);
  }
}
