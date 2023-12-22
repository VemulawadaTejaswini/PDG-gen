import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int n = sc.nextInt();  //number_of_cards
      int r = sc.nextInt();  //number_of_cutting
      if(n==0&&r==0)break;

      int[] deck = new int[n];
      int[] temp = new int[n];
      for(int i=0;i<n;i++){
        deck[i] = n-i;
      } //assign_numbers_to_each_cards_in_descending order

      for(int i=0;i<r;i++){  //do_cutting
        int p = sc.nextInt();
        int c = sc.nextInt();
        System.arraycopy(deck,p-1,temp,0,c);
        System.arraycopy(deck,0,deck,c,p-1);
        System.arraycopy(temp,0,deck,0,c);
      }

      System.out.println(deck[0]);
    } //end_of_while
  }
}