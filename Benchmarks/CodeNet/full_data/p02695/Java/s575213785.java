import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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
	static int a[]=new int[51];
	static int b[]=new int[51];
	static int c[]=new int[51];
	static int d[]=new int[51];
	
	
	
	
	public static void main(String[] args) {
		//String S=sc.next();
		
		//int N=sc.nextInt();for(int i=0;i<N;i++) {}
		int N=sc.nextInt();
		int M=sc.nextInt()	;
		int Q=sc.nextInt()	;
		
		
		
		for(int i=0;i<Q;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=sc.nextInt();
			d[i]=sc.nextInt();
		}
		
		int t[]=new int[11];
		int v=Math.min(N, M);
		
		int ans=0;
		for(int aa=1;aa<=10;aa++) {
			t[0]=aa;
			
			for(int bb=t[0];bb<=10;bb++) {
				t[1]=bb;
				for(int cc=t[1];cc<=10;cc++) {
					t[2]=cc;
					for(int cc1=t[2];cc1<=10;cc1++) {
						t[3]=cc1;
						for(int cc2=t[3];cc2<=10;cc2++) {
							t[4]=cc2;
							for(int cc3=t[4];cc3<=10;cc3++) {
								t[5]=cc3;
								
								for(int cc4=t[5];cc4<=10;cc4++) {
									t[6]=cc4;
									for(int cc5=t[6];cc5<=10;cc5++) {
										t[7]=cc5;
										for(int cc6=t[7];cc6<=10;cc6++) {
											t[8]=cc6;
											for(int cc7=t[8];cc7<=10;cc7++) {
												t[9]=cc7;
												int sum=0;
												for(int i=0;i<Q;i++) {
																	if(t[b[i]-1]-t[a[i]-1]==c[i]) {
																		sum+=d[i];
																	}
																}
												ans=Math.max(ans, sum);
												
											}
											
										}
										
									}
									
								}
							}
							
						}
						
					}
					
				}
			
			
			}
		}
		p(ans);
	}
	
	
	/*int sum=0;
	 * for(int i=0;i<Q;i++) {
						if(t[b[i]-1]-t[a[i]-1]==c[i]) {
							sum+=d[i];
						}
					}
					ans=Math.max(ans, sum);
					*/
	
	
	
	
	

	


	
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
	
