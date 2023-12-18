import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int C = 0;
        List<Integer> list = new ArrayList<>();
		// MAX
		int N = sc.nextInt();
      	int tmp = 0;
      	//System.out.println(N);
        // 3 nest for 
        for(int i = 1 ; i <= N ; i++){
            for(int j = 1 ; j <= N ; j++){
                for(int k = 1 ; k <= N ; k++){
                    tmp = (i * 100) + (j * 10) + k; 
                    	//System.out.println(tmp);
                        list.add(tmp);
                    
                }
            }
        }
		// 出力
		System.out.println(list.size());
	}
}