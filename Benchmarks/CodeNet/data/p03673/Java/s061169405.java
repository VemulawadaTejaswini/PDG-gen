import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < a;i++){
            list.add(sc.nextInt());
            Collections.reverse(list);
        }
      
        for(int i = 0; i < a;i++){
      		System.out.print(list.get(i) + " ");
        }
        System.out.println();
 
    }
}