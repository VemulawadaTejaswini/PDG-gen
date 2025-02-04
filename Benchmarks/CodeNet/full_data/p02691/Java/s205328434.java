import java.util.*;
import java.lang.Math;
 
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int peopleNum = Integer.parseInt(sc.next());  // 人数
      	
      	List<Integer> list = new ArrayList<Integer>();
      	for(int i = 0; i < peopleNum; i++){
          	list.add(Integer.parseInt(sc.next()));
        }
      
      	int sum = 0;
      	for(int i = 0; i < peopleNum; i++){
          int heightA = list.get(i);
          for(int j = i + 1; j < peopleNum; j++){
            	int heightB = list.get(j);
            	int absVal = Math.abs((i + 1) - (j + 1));  // 番号の差の絶対値
            	int heightSum = heightA + heightB;  // 身長の差
            	
            	if(absVal == heightSum){
                  	sum++;
                }
          }
        }
        System.out.println(sum);
    }
}