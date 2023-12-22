import java.util.*;

@SuppressWarnings("unchecked")

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] s = new String[100];
		ArrayList<String> list = new ArrayList<String>();
		PriorityQueue<Integer>[] que = new PriorityQueue[100];
		for(int i=0;i<100;i++){
			que[i] = new PriorityQueue<Integer>();
		}
		
		int k=0;
		String t = "";
		int n = 0;
		while(sc.hasNext()){
			t = sc.next();
			n = sc.nextInt();
			if(list.indexOf(t)==-1){
				list.add(t);
				s[k] = t;
				que[k].add(n);
				k++;
			}else{
				que[list.indexOf(t)].add(n);
			}
		}
		Collections.sort(list);
		
		for(int i=0;i<list.size();i++){
			t = list.get(i);
			System.out.println(t);
			for(int j=0;j<k;j++){
				if(s[j].compareTo(t)==0){
					n = que[j].size();
					for(int p=0;p<n;p++){
						if(p!=0) System.out.print(" ");
						System.out.print(que[j].poll());
					}	
				}
			}
			System.out.println();
		}
	
	}	
}