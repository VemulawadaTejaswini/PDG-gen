import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		int n = sc.nextInt();
		int k = sc.nextInt();
     	int sum = 0;
		List<Integer> allNum = new ArrayList<>();
        for(int i = 0; i < n ; i++){
          int p = sc.nextInt();
          allNum.add(p);
        }
      
        Collections.sort(allNum);
      	for(int j = 0;j < k ; j ++){
        	sum += allNum.get(j);
        }

		System.out.println(sum);
		
	}
}