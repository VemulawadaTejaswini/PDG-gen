import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        List<Integer> minus = new ArrayList<Integer>();
        List<Integer> plus = new ArrayList<Integer>();
        List<String> result = new ArrayList<String>();
        int minusCount = 0;
        int plusCount = 0;
        int temp = 0;
        for(int i=0; i<num; i++){
  		  temp = sc.nextInt();
          if(temp >= 0) {
            //plus[plusCount] = temp;
            plus.add(temp);
            //plusCount++;
          }
          else{
            minus.add(temp);
            //minusCount++;
          }
        }
        if(minus.size() == 0){
          if(plus.size() == 2){
            int max = plus.get(0) >= plus.get(1) ? plus.get(0) : plus.get(1);
             int min = plus.get(0) >= plus.get(1) ? plus.get(1) : plus.get(0);
             temp = max- min;
             result.add(max + " " + min);
             plus.remove(0);
             plus.remove(1);
             plus.add(temp);
          }
          else{
             int max = plus.get(0) >= plus.get(1) ? plus.get(0) : plus.get(1);
             int min = plus.get(0) >= plus.get(1) ? plus.get(1) : plus.get(0);
             temp = min - max;
             result.add(min + " " + max);
             plus.remove(0);
             plus.remove(1);
             minus.add(temp);
          }
        }
        else if(plus.size() == 0){
          if(minus.size() == 2){
            int max = plus.get(0) >= plus.get(1) ? plus.get(0) : plus.get(1);
             int min = plus.get(0) >= plus.get(1) ? plus.get(1) : plus.get(0);
             temp = min - max;
             result.add(min + " " + max);
             minus.remove(0);
             minus.remove(1);
             plus.add(temp);
          }
          else{
             int max = minus.get(0) >= minus.get(1) ? minus.get(0) : minus.get(1);
             int min = minus.get(0) >= minus.get(1) ? minus.get(1) : minus.get(0);
             temp = max - min;
             result.add(max + " " + min);
             minus.remove(0);
             minus.remove(1);
             plus.add(temp);
          }
        }
        if(minus.size() == 1 && plus.size() == 1){
          result.add(plus.get(0) + " " + minus.get(0));
          temp = plus.get(0) - minus.get(0);
          minus.remove(0);
          plus.remove(0);
          plus.add(temp);
        }
        while(minus.size() > 0 && plus.size() > 0){
          if(plus.size() > 1){
             temp = minus.get(0) - plus.get(0);
             result.add(minus.get(0) + " " + plus.get(0));
             minus.remove(0);
             plus.remove(0);
             minus.add(temp);
          }
          else{
             temp = plus.get(0) - minus.get(0);
             result.add(plus.get(0) + " " + minus.get(0));
             minus.remove(0);
             plus.remove(0);
             plus.add(temp);
          }
        }
		System.out.println(plus.get(0));
        //System.out.println(result.size());
        /*for(String item: result){
          System.out.println(item);           
        }*/
        for(int i=0; i<result.size(); i++){
          System.out.println(result.get(i)); 
        }
	}
}