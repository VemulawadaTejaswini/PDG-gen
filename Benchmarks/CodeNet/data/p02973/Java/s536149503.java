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
			Collections.sort(color);		
			int result = Collections.binarySearch(color, a[i]);
			//System.out.println("result="+result);
			int index = (result >= 0) ? result : ~result;
			if(i > 0 && color.get(0) == a[i])index = 0;
			//if(color.get(color.size()-1) == a[i])index = color.size()-1;
			//System.out.println("a[i]="+a[i] + ", index= "+ index);
			if(index == 0) {
				color.add(a[i]);
			} else {
				color.set(index-1, a[i]);
			}
			//System.out.println(color.toString());			
		}		
		System.out.println(color.size());

	}

}
