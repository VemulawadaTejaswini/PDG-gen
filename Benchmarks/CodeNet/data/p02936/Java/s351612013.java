import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
		int q = sc.nextInt();
        Parent[] parents = new Parent[n];
        parents[n - 1] = new Parent(n);
        int index = 0;
        for(int i = 0; i < n - 1; i++) {
          parents[i] = new Parent(i + 1);
          int value = sc.nextInt();
          if (value - 1 > index) {
            index = value - 1;
          }
          parents[index].addChild(sc.nextInt());
        }
        for(int i = 0; i < q; i++) {
          int parentNo = sc.nextInt();
          int score = sc.nextInt();
          Parent parent = parents[parentNo - 1];
          parents = parent.addCount(score, parents);
        }
        for(Parent parent : parents) {
          	// 出力
			System.out.println(parent.count);
        }
	}
  
  private static class Parent {
    public int count = 0;
    public int parent;
    public ArrayList<Integer> childs = new ArrayList<>();
    public Parent(int value) {
      this.parent = value;
    }
    public void addChild(int value) {
      childs.add(value);
    }
    public Parent[] addCount(int value, Parent[] parents) {
      parents[parent - 1].count += value;
      for (int child : childs) {
        parents[child - 1].addCount(value, parents);
      }
      return parents;
    }
  }
}