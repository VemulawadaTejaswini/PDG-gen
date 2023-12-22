import java.util.*;
import java.io.*;
class Main{
  public static final int N = 9;
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char c[] = new char[N];
    String end = "123456780";
    String puzzle="";
    // int right = 1, left = -1, on = -3, under = 3;
    int index[] = {1,-1,-3,3};
    HashMap<String, Integer> hash = new HashMap<String, Integer>();
    Queue<String> queue = new ArrayDeque<String>();
    for(int i = 0; i<N; i++){
      c[i] += (char)(sc.nextInt()+48);
      puzzle +=c[i];
    }
    // for(int i = 0; i<N; i++){
    //   System.out.print(c[i]);
    // }
    // puzzle = toString(c);
    queue.add(puzzle);
    hash.put(puzzle,0);

    while(!queue.isEmpty()){
      String comfirm = queue.remove();
      if(comfirm.equals(end)){
        // String comfirm = queue.remove();
        System.out.println(hash.get(comfirm));
        break;
      }

      StringBuffer s = new StringBuffer(comfirm);
      int vacancy = s.indexOf("0");
      for(int i = 0; i<4; i++){
        if(vacancy + index[i] >= 0 && vacancy + index[i]<N){//範囲外でない（上下）
          if( !((index[i] == -1)&& ((index[i]+vacancy) % 3==2))  &&  !((index[i] == 1) &&((index[i]+vacancy) % 3 == 0))  ){//左右の範囲外確認
            //交換作業して存在しなければキューとハッシュ追加。
            s.setCharAt(vacancy, s.charAt(vacancy + index[i]));
            s.setCharAt(vacancy + index[i], '0');
            if (!hash.containsKey(s.toString())) {
              queue.add(s.toString());
              hash.put(s.toString(), hash.get(comfirm)+1);
            }
            //そして戻す。
            s.setCharAt(vacancy + index[i], s.charAt(vacancy));
            s.setCharAt(vacancy, '0');
          }
        }
      }

      // @Override
      // public String toString() {
      // }
    }
  }
}


