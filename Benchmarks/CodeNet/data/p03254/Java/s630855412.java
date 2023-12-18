import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int counter = sc.nextInt();
    int subject = sc.nextInt();
    int[] children = new int[counter];
    for(int i = 0;i<counter;i++){
      children[i] = sc.nextInt();
    }
    Arrays.sort(children);
    int result = 0;
    while(result < counter && subject >= children[result]){
      subject -= children[result];
      result ++;
    }
    System.out.println(result);
  }
}