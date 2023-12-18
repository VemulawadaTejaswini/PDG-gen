import java.util.*;
public class Main {
	public static void myout(Object text){//standard output
		System.out.println(text);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      Long N = sc.nextLong();
      Long output = new Long(0);
      if(N <= 2){
        myout(output);
        return;
      }
      ArrayList<Long> list = getDivisorList(N);
      for(int i = 0; i < Math.floor(list.size() / 2); i++){
        if(list.get(i) >= Math.sqrt(N)){
        	output += list.get(i) - 1;
      	}else{
          break;
        }
      }
      //myout(list);
      myout(output);
      
      /*ArrayList<Long> test = new ArrayList<Long>(100000);
      for(int i = 1; i <= N; i++){
        if(N / i == N % i){
          test.add(new Long(i));
        }
      }
      myout(test);*/
      
	}
  
  public static boolean isPrime(Long val){
	if(val == 1 || (val != 2 && val % 2 == 0)){
		return false;
	}else if(val == 2){
		return true;
	}
	double root = Math.floor(Math.sqrt(val));
	for(int i = 3; i <= root; i += 2){
		if(val % i == 0){
			return false;
		}
	}
	return true;
	}
  
  public static ArrayList<Long> getDivisorList(Long val){
	ArrayList<Long> list = new ArrayList<Long>();
	for(Long i = new Long(1); i * i <= val; i++){
		if(val % i == 0){
			list.add(i);
			if(i * i != val){
				list.add(val / i);
			}
		}
	}
    Collections.sort(list,Comparator.reverseOrder());
	return list;
}
}
