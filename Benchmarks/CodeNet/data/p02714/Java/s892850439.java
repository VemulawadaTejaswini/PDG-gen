import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int  N = sc.nextInt();
		ArrayList<Integer> R = new ArrayList<Integer>();
		ArrayList<Integer> G = new ArrayList<Integer>();
		ArrayList<Integer> B= new ArrayList<Integer>();
		
		String S = sc.next();
		boolean b = true;
		for(int i = 0;i<S.length();i++) {
			char c= S.charAt(i);
			if(c == 'R') {
				R.add(i);
				
			}else if(c == 'G'){
				G.add(i);
				
			}else if(c == 'B'){
				B.add(i);
			}
		}
		int ans = 0;
			for(int i = 0;i<R.size();i++) {
				for(int j = 0;j<G.size();j++) {
					for(int k = 0;k<B.size();k++) {
						int t1=R.get(i);
					    int t2=G.get(j);
					    int t3=B.get(k);
					    if(t1 > t2) {
					    	int temp = t1;
					    	t1 = t2;
					    	t2 = temp;
					    }
					    if(t2 > t3) {
					    	int temp = t3;
					    	t3 = t2;
					    	t2 = temp;
					    }
					    if(t1 > t2) {
					    	int temp = t1;
					    	t1 = t2;
					    	t2 = temp;
					    }
						if(t2-t1 == t3-t2){
							
						}else {
							ans++;
						}
					}
				}
				
			}
			System.out.println(ans);
			
		}
	
}