import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < a;i++){
            if(i % 2 == 0){
            	list.add(sc.nextInt());
            }else{
              	list.add(0,sc.nextInt());
            }
            
        }
      
        for(int i = 0; i < a;i++){
      		System.out.print(list.get(i) + " ");
        }
        System.out.println();
 
    }
}