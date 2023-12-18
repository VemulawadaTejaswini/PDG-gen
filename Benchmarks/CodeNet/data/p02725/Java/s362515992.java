import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      int lake = sc.nextInt();//1週の長さ
      int house = sc.nextInt();//周りの家の数
      
      //各家が何メートルおきに配置されているかリストの空箱用意
      List<Integer>m = new ArrayList<>();
      
      //リスト作成
      for(int i =0; i<house; i++){
        	m.add(sc.nextInt());
      }
      //最大値から0を除いた最小値で出力
      if(m.get(0) == 0){
        	System.out.println(m.get(m.size()-1)-m.get(1));
      }
      else{
        	System.out.println(m.get(m.size()-1)-m.get(0));
      }
    }
}