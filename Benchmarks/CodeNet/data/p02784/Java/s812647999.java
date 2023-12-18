import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int h = sc.nextInt();
      	int n = sc.nextInt();
      	//配列
      	List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
        	list.add(sc.nextInt());
        }
      	//1回ずつ必殺技を使いHPを減らす
      	for(int i=0; i<n; i++) {
      	h -= list.get(i);
        }
      if(h <= 0) {
        System.out.println("Yes");       
      }else{
        System.out.println("No");    
      }
     }
}