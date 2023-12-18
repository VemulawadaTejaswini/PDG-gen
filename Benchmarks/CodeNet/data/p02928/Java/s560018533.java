import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> tmpList = new ArrayList<Integer>();
       ArrayList<Integer> tmpList2 = new ArrayList<Integer>();
      	while(sc.hasNext()){
          tmpList.add(sc.nextInt());
        }
      for(int i = 0; i < 2; i++){
        for(int j = 0; j < tmpList.size(); j++){
          tmpList2.add(tmpList.get(j));
        }
      }
      
      boolean flag = false;
      for(int i = 0; i < N - 1; i++){
        if(tmpList.get(i) != tmpList.get(i + 1)){
          flag = true;
          break;
        }
      }
      
      if(!flag){
        System.out.println("0");
        return;
      }else{
        ArrayList<Long> resultList = new ArrayList<Long>();
        resultList.add(getPatten(tmpList));
        resultList.add(getPatten(tmpList2));
        resultList.add(resultList.get(0) +  2 * resultList.get(1));
        if(K <= 3){
          System.out.println(resultList.get(K - 1));
        }else{
          int count = 3;
           while(count != K){
             Long first = resultList.get(0);
            Long second = resultList.get(1);
           Long third = resultList.get(0) +  2 * resultList.get(1);
             resultList.set(0,second);
           resultList.set(1,third);
           resultList.set(2,resultList.get(0) +  2 * resultList.get(1));
           count++;
           }
          System.out.println(resultList.get(2) % 1000000007);
        }
      }
      
	}
  
  public static Long getPatten(ArrayList<Integer> list){
    long ret = 0;
    for(int i = 0; i < list.size(); i++){
      for(int j = i; j < list.size(); j++){
        if(list.get(i) > list.get(j)){
          ret++;
        }
      }
    }
    return ret;
  }
}
