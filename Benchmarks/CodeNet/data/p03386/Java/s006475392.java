import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int i;
        for(i = 0; i < k;i++){
          if(a + i <= b){
          list.add(a + i);
          }
        }
      	for(i = k-1; i >= 0;i--){
          if(b - i >= a){          
          list.add(b - i);
          }
        }
		List listB = new ArrayList(new HashSet<>(list));
        Collections.sort(list);
        for(i = 0;i < listB.size(); i++){
          System.out.println(listB.get(i));
        }
    }
}