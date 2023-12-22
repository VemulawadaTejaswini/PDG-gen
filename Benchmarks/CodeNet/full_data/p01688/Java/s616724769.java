import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		ArrayList<Integer> d = new ArrayList<Integer>();
		int x = sc.nextInt();
		for(int i=0;i<x;i++){
			String s = sc.next();
			int p = sc.nextInt();
			if(s.compareTo("D")==0) d.add(p);
		}
		
		ArrayList<Integer> dd = new ArrayList<Integer>();
		int y = sc.nextInt();
		for(int i=0;i<y;i++){
			String s = sc.next();
			int p = sc.nextInt();
			if(s.compareTo("DD")==0) dd.add(p);
		}
		
		Collections.sort(d);
		Collections.reverse(d);
		Collections.sort(dd);
		Collections.reverse(dd);
		
		int sum = 0;
		while(true){
			if(n==0) break;
			
			if(dd.size()==0){
				if(d.size()==0) break;
				sum += d.get(0);
				d.remove(0);
				n--;
			}else if(d.size()<2){
				if(n==1){
					if(d.size()==1){
						sum += d.get(0);
						d.remove(0);
						n--;	
					}
					break;
				}
				sum += dd.get(0);
				dd.remove(0);
				n-=2;
			}else{
				if(d.get(0)+d.get(1)<=dd.get(0)){
					sum += dd.get(0);
					dd.remove(0);
					n-=2;
				}else{
					sum += d.get(0);
					d.remove(0);
					n--;
				}
			}
		}
		System.out.println(sum);
	}
}