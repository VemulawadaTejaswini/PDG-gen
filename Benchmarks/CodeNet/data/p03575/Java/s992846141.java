import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int M = scan.nextInt();
			int[]a = new int[M];
			int[]b = new int[M];
			GM[]map = new GM[N];
			for(int i = 0;i<N;i++)map[i] = new GM(i+1);
			
			for(int i = 0;i<M;i++) {
				a[i] = scan.nextInt();
				b[i] = scan.nextInt();
				map[a[i]-1].hen.add(b[i]);
				map[b[i]-1].hen.add(a[i]);
			}
			
			Deque<GM>que = new ArrayDeque<GM>();
			que.addFirst(map[0]);
			map[0].se = true;
			map[0].kyori = 0;
			map[0].senzo .add(1);
			
			int dis = 0;
			
			while(!que.isEmpty()) {
				GM p = que.removeLast();
				for(Integer num:p.hen) {
					if(map[num-1].se==false) {
						map[num-1].kyori = p.kyori+1;
						map[num-1].se=true;
						map[num-1].sen=p.num;
						map[num-1].senzo.addAll(p.senzo);
						map[num-1].senzo.add(num);
						que.addFirst(map[num-1]);
					}else if(map[num-1].se==true&&map[num-1].num!=p.sen&&p.hen.size()>=3) {
						//System.out.println(p.num+" "+map[num-1].num);
						//System.out.println();
						
							for(int i = 0;i<Math.min(p.senzo.size(), map[num-1].senzo.size());i++) {
								
								if(p.senzo.get(i)!=map[num-1].senzo.get(i)) {
									int k = p.senzo.get(i-1);
									//System.out.println(p.senzo.get(i-1));
									dis+=map[num-1].kyori-map[k-1].kyori;
									//System.out.println(dis);
									dis+=p.kyori-map[k-1].kyori;
									//System.out.println(dis);
									dis++;
									//System.out.println(dis);
									break;
								}
								
								
								
							}
						
						
						
					}
				}
				
			}
			
			
			
			/*
			for(int i = 0;i<N;i++) {
				System.out.print(map[i].sen+" ");
				System.out.print("map["+(i+1)+"]");
				System.out.print(" 深さ ");
				System.out.print(map[i].kyori);
				System.out.print(" 先祖たち");
				for(Integer s:map[i].senzo) {
					System.out.print(s);
					System.out.print(" ");
				}
				System.out.println();
			}*/
			
			
			System.out.println(M-dis);
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}
	
	static class GM{
		int num ;
		boolean se=false;
		int sen=-1;
		ArrayList<Integer>hen = new ArrayList<Integer>();
		ArrayList<Integer>senzo = new ArrayList<Integer>();
		int kyori=-1;
		
		GM(int n){
			num = n;
		}
		
	}
	


}
