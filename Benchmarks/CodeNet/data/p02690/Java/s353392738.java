import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
 


public class Main {
	private static Scanner sc = new Scanner(System.in);
	//result = Math.pow(num1, num3)
	//StringBuffer str = new StringBuffer(hoge1);
	//String hoge2 = str.reverse().toString();
	//map.containsKey(A)

	//Map<String, Integer> map = new HashMap<String, Integer>(n);
	/*for ( キーのデータ型 key : マップの名前.keySet() ) {
		データのデータ型 data = マップの名前.get( key );
		
		// keyやdataを使った処理;
	}*/
	//int i = Integer.parseInt(s);
	//Queue<String> qq=new ArrayDeque<>(); //add,poll,peek
	//Deque<String> qq=new ArrayDeque<>();//push,pop,peek
	//ArrayList<String> cc = new ArrayList<>(n);
	//Collections.sort(list);
	//Array.sort(list);   cc.contains(tmp)
	//Arrays.asList(c).contains("a")
	//list.set(1,"walk");//1 1 2 3 5
	//static long mod =1000000007;
	//static 	ArrayList<Integer> cc = new ArrayList<>(100);
	
	
	
	
	//for(int i=0;i<N;i++) {}
	public static void main(String[] args) {
		//int N=sc.nextInt();for(int i=0;i<N;i++) {}
		int X=sc.nextInt();
		
		int ansA=0,ansB=0;
		
		for(int i=0;true;i++) {
			//p(i);
			int A5_1=(int) Math.pow(i, 5);
			int A5_2=A5_1*-1;
			
			int B5_1=A5_1-X;
			int B5_2=A5_2-X;
			
			int B_1=(int) Math.pow(B5_1, 0.2);
			int B_2=(int)Math.pow(B5_2, 0.2);
			
		//	p(i+" "+A5_1+" "+A5_2+" "+B5_1+" "+B5_2+" "+B_1+" "+B_2);
			
			
			if((int)Math.pow(B_1, 5)==B5_1) {
				ansA=i;ansB=B_1;
				break;
			}
			if((int)Math.pow(B_2, 5)==B5_2) {
				ansA=-1*i;ansB=B_2;
				break;
			}
			if(B5_1==-1) {
				ansA=i;ansB=-1;
				break;
			}
			if(B5_2==-1) {
				ansA=-1*i;ansB=-1;
				break;
			}
		}
		p(ansA+" "+ansB);
		
		
		
		
	}
	

	
	
	
	

	


	
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	static String nextPermutation(String s) {
		ArrayList<Character> list=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			list.add(s.charAt(i));
		}
		int pivotPos=-1;
		char pivot=0;
		for(int i=list.size()-2;i>=0;i--) {
			if(list.get(i)<list.get(i+1)) {
				pivotPos=i;
				pivot=list.get(i);
				break;
			}
		}
		if(pivotPos==-1&&pivot==0) {
			return "Final";
		}
		int L=pivotPos+1,R=list.size()-1;
		
		
		
		int minPos=-1;
		char min =Character.MAX_VALUE;
		
		for(int i=R;i>=L;i--) {
			if(pivot<list.get(i)) {
				if(list.get(i)<min) {
					min=list.get(i);
					minPos=i;
				}
			}
		}
		
		Collections.swap(list, pivotPos, minPos);
		Collections.sort(list.subList(L, R+1));
		
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<list.size();i++) {
			sb.append(list.get(i));
		}
		return sb.toString();
	}
}
	
