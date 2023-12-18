import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int Q = sc.nextInt();

    //List<Tree> list = new ArrayList<>();
    Map<Integer, Tree> map = new HashMap<>();
    map.put(1 ,new Tree(0));

    /* treeを作成 */
    for(int i = 0; i < N - 1; i++){
        int a = sc.nextInt();
        int b = sc.nextInt();

        Tree newTree = new Tree(a);
        map.put(b, newTree);
    }

    for(int i = 0; i < Q; i++){
      int p = sc.nextInt();
      int x = sc.nextInt();
      map.get(p).addScore(x);
    }

    System.out.print(map.get(1).getScore() + " ");

    for(int i = 2; i < N + 1; i++){
      Tree t = map.get(i);
      t.addScore(map.get(t.getParendNodeNumber()).getScore());
      System.out.print(t.getScore() + " ");
    }
    System.out.println();
  }

  public static class Tree  {
    /* 子要素 */
    private int parendNodeNumber;
    private int score;

    public Tree(int parendNodeNumber){
      this.parendNodeNumber = parendNodeNumber;
    }

    public int getParendNodeNumber(){
      return this.parendNodeNumber;
    }

    public void addScore(int point){
      this.score += point;
    }

    public int getScore(){
      return this.score;
    }
    public void print(){
      System.out.print(this.score + " ");
    }
  }
}
