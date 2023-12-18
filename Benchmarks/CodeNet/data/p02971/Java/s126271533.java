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
    Collections.sort(nSeq,Collections.reverseOrder());
    for(int i = 0;i < nSeq.size();i++){
      System.out.println(nSeq.get(i));
    }
  }
}