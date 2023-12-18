import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    //nとstringを取得
    
    ArrayList<Integer> list = new ArrayList<>();
    int x = 0;
    //空のx,配列listを作成
    
    char[] chr;
    chr = s.toCharArray();
    //tocharArrayでstringをchar[n]の配列に
    
    for (int i=0; i<n; i++){
      if (chr[i]=='I'){
        x++;
        list.add(i, x);
      }else{
        x--;
        list.add(i, x);
      }//forでn回回す、Iだったらlist[i].add(x++)、Dだったらx--
    }
    Collections.sort(list);
    if(list.get(n-1)>0){
      System.out.println(list.get(n-1));
    }else{
      System.out.println(0);
    }
  }
}

//listをArrays.sort
//list[0]を表示