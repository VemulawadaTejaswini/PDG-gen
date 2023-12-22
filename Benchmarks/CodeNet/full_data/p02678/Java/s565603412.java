import java.util.*;

public class Main{

  static Scanner sc = new Scanner(System.in);
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {

    int n = nextInt();
    int m = nextInt();

    List<List<Integer>> G = new ArrayList<>();
    for(int i=0;i<n;i++){
      G.add(new ArrayList<>());
    }

    //2次元リストから1次元リストを取り出し、格納
    for(int i=0;i<m;i++){
      int a = nextInt() - 1;
      int b = nextInt() - 1;
      G.get(a).add(b); // [G3.get(a[i])] はリスト
      G.get(b).add(a);
    }

    //ノードiのノード0までの距離を格納
    int[] kyori = new int[n];

    //今探索している場所の深さ
    int depth = 1;

    //ノードiを検出済みかどうか
    boolean[] seen = new boolean[n]; //初期値はfalse
    //検出済みのノードを起点にした探索の2回目以降を防ぐ

    //これから隣接を探索するリスト
    ArrayDeque<Integer> todo = new ArrayDeque<>(); //先入先出（キュー）

    //ノード0からスタートするため
    seen[0] = true;
    todo.add(0);

    //これから隣接を探索するノード番号の格納先
    int v = 0;

    //探索中の深さのノードの数
    int width = 1; //始めはノード0のみなので1

///////////////////////////////////////////////////////////////
    while(todo.size()>0){

      v = todo.removeFirst();

      //vがどこと繋がっているか見る
      for(int i : G.get(v)){
        if(!seen[i]){ //未検出なら
          seen[i] = true; //検出済みにする
          todo.addLast(i); //探索リストに追加
          kyori[i] = depth; //深さを格納
        }
      }

      //深さ記録
      width --;

      if(width==0){ //今の深さのノードを全て探索し終えたら
        depth++; //深さをプラス1
        width = todo.size(); //次から探索する深さのノード数を記録
      }

    }
///////////////////////////////////////////////////////////////

    //解答が存在するか否か
    boolean ok = true;

    //答えを格納
    int[] ans = new int[n];

    for(int i=1;i<n;i++){ //G[1]～G[n-1]に対して（0以外の全ノードに対して）
      for(int j : G.get(i)){ //G[i]の要素を1つずつjに代入していく
        if(kyori[i]>kyori[j]){ //2つ小さい深さのノードには繋がらないので、これでok
          ans[i] = (j+1); //実際のノード番号はプラス1
          break;
        }
      }
      if(ans[i]==0){ //ノード番号が更新されなければ、
        ok = false;
        break;
      }
    }

    if(ok){
      System.out.println("Yes");
      for(int i=1;i<n;i++){
        System.out.println(ans[i]);
      }
    }
    else{
      System.out.println("No");
    }

  }

  static int nextInt(){
    return Integer.parseInt(sc.next());
  }

}
