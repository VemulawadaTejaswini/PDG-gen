import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		int N = sc.nextInt();
        Long K = sc.nextLong();
        Long MOD = new Long("1000000007");
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
      Long A = getPatten(tmpList);
      Long B = (getPatten(tmpList2) - (2 * A));
      //System.out.println(A);
      //System.out.println(getPatten(tmpList2) + "↓");
      //System.out.println(B);
     	 System.out.println((((K * (K - 1) / 2) % MOD) * B + A * K) % MOD);
      
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
