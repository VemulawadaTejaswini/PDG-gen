import java.util.*;
public class Main {
  
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
      
      	List<Integer> list = new ArrayList<>(); 
      	// 全部1つのListに入れちゃう
      	for(int i = 0 ; i < 2 * M - 1; i++) {
            list.add(sc.nextInt());
        }
 
      	// 「自分と繋がってる点」リストを点の種類分つくって1つのリストにまとめるよ
      　List<connectingNumsList> connectingNumsListList = new ArrayList<>();
      	for(int i = 0; i < N ; i++) {
          	String currentNumString = String.valueOf(i);
          	String connectingNumsList = currentNumString.concat("List");
          	List<Integer> connectingNumsList = 
            
        }
		
    	  
    }
}