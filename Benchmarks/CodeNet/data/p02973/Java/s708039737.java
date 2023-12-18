import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];	
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		
		ArrayList<Integer> color = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int max = -1;
			int index = 0;
			Collections.sort(color);
			for(int j = color.size()-1; j >= 0; j--) {
				int c = color.get(j);
				if(c < a[i] && max < c) {
					max = c;
					index = j;
					break;
				}
				
			}
			
			if(max == -1) {
				color.add(a[i]);
			} else {
				color.set(index, a[i]);
			}
			//System.out.println("max="+ max);
			//System.out.println(color.toString());
			
		}
		
		System.out.println(color.size());
		
	}

}
