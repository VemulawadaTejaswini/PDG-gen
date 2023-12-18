import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	static int N;
	static int K;
	static int[] arry;
	static int Answer = 99999999;
	static boolean status = false;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
			N = sc.nextInt();
			K = sc.nextInt();
			arry = new int[N];
			for (int i = 0; i < N; i++) {
				int a = sc.nextInt();
				if(a==0) {
					status=true;
				}
				arry[i] = a;
			}
			Lazhu.cal(arry,K);
			System.out.println(Answer);
		}
	 public static int cal(int[] chars, int n) {
	        if (n <= 0 || chars == null) {
	            return Answer;
	        }
	        List<Integer> charList = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            charList.add(-1);
	        }
	        return listAll(charList, chars, n);
	    }

	 public static int listAll(List<Integer> list, int[] chars, int n) {
	        if (n == 0) {
	        	if(!status) {
	        		list.add(0);
	        	}
	        	int temp = 0;
	        	for (int i = 1; i < list.size(); i++) {
					if(list.get(i)>=list.get(i-1)) {
						temp+=list.get(i)-list.get(i-1);
					}else {
						temp+=list.get(i-1)-list.get(i);
					}
				}
	        	if(Answer>=temp) {
	        		Answer = temp;
	        	}
	        	if(!status) {
	        		 for (int i = 0; i < list.size(); i++) {
	        			 if(list.get(i)==0) {
	        				 list.remove(i);
	        			 }
	        		 }
	        	}
	            return Answer;
	        }
	        for (int aChar : chars) {                     
	            if (!list.contains(aChar)) {                
	                list.set(list.size() - n, aChar);       
	            } else {                                    
	                continue;
	            }
	            listAll(list, chars, n - 1);               
	            list.set(list.size() - n, -1);            
	        }
			return Answer;
	    }
}
