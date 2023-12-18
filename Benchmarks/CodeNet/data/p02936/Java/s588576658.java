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
    map.put(1 ,new Tree(1));

    /* treeを作成 */
    for(int i = 0; i < N - 1; i++){
        int a = sc.nextInt();
        int b = sc.nextInt();

        Tree t = map.get(a);
        Tree newTree = new Tree(b);
        map.put(b, newTree);
        t.addChild(newTree);
    }

    for(int i = 0; i < Q; i++){
      int p = sc.nextInt();
      int x = sc.nextInt();
      map.get(p).addScore(x);
    }

    for(int i = 1; i < N + 1; i++){
      System.out.print(map.get(i).getScore() + " ");
    }
    System.out.println();
  }

  public static class Tree  {
    /* 子要素 */
    private List<Tree> list = new ArrayList<>();
    private int score = 0;
    private int nodeNumber = 0;

    public Tree(int nodeNumber){
      this.nodeNumber = nodeNumber;
    }

    public void addChild(Tree tree){
      this.list.add(tree);
    }

    public List<Tree> getChildList(){
      return this.list;
    }

    public void addScore(int point){
      this.score += point;
      for (Tree tree: this.list ) {
        tree.addScore(point);
      }
    }

    public int getScore(){
      return this.score;
    }
    public void print(){
      System.out.print(this.score + " ");
    }

    public int getNodeNumber(){
      return this.nodeNumber;
    }
  }
}
