import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> nSeq = new ArrayList<>();
    int n = sc.nextInt();
	for(int i = 0;i < n;i++){
      nSeq.add(sc.nextInt());
    }
    int box = 0;
    int i = 0;
    for(int x : nSeq){
      box = x;
      nSeq.set(i,0);
      System.out.println(Collections.max(nSeq));
      nSeq.set(i,x);
      i++;
    }
  }
}