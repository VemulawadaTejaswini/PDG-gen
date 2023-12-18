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
			
			Collections.sort(color);
			
			int result = Collections.binarySearch(color, a[i]);
			
			int index = (result >= 0) ? result : ~result;
			/*for(int j = color.size()-1; j >= 0; j--) {
				int c = color.get(j);			
				if(c < a[i] ) {
					max = c;
					index = j;
					break;
				}
				
			}
			*/
			//System.out.println(i + " "+ index);
			if(index == 0) {
				color.add(a[i]);
			} else {
				color.set(index-1, a[i]);
			}
			//System.out.println("max="+ max);
			//System.out.println(color.toString());
			
		}
		
		System.out.println(color.size());
		
	}

}
