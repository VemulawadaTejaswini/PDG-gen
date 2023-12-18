import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        Long output = new Long("0");
        Hashtable<String,Long> ht = new Hashtable<String,Long>();
		// 整数の入力
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++){
          char[] tmp = sc.next().toCharArray();
          Arrays.sort(tmp);
          String tmp2 = new String(tmp);
          if(ht.get(tmp2) == null){
            ht.put(tmp2,new Long("1"));
          }else{
            output += ht.get(tmp2);
            ht.put(tmp2,ht.get(tmp2) + 1);
          }
        }
		System.out.println(output);
		
		// 出力
		
	}
}