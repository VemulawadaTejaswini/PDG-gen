import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer N = sc.nextInt();
		Integer M = sc.nextInt();
      	List<Integer> list = new ArrayList<>();
      	for(int i = 0; i < N; i++){
 		Integer a = sc.nextInt();
         list.add(a);
        }
      int sum = 0;
      for(int j = 0; j < N; j++){ //合計計算
        sum = sum + list.get(j);
      }
      int flag = 0;
      for(int k = 0; k < N; k++){//条件計算
        if(list.get(k) >= (sum/(4*M))){
          flag++;
        }
      }
      if(flag > M){
      System.out.println("Yes");
      }else{
      System.out.println("No");
      }
	}
}