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
      for(int i = 0; i < list.size(); i++){
        if(list.get(i) > Math.ceil(Math.sqrt(N))){
        	output += list.get(i) - 1;
      	}else{
          break;
        }
      }
      //myout(list);
      myout(output);
      
      /*ArrayList<Long> test = new ArrayList<Long>(100000);
      Long testout = new Long(0);
      for(int i = 1; i <= N; i++){
        if(N / i == N % i){
          test.add(new Long(i));
          testout += new Long(i);
        }
      }
      Collections.sort(test,Comparator.reverseOrder());
      myout(test);
      myout(testout);
      myout(output.equals(testout));*/
      
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
