import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(a, Collections.reverseOrder());
		
		boolean br = false;
		int height = 0;
		int width = 0;
		
		for(int i=0; i<a.length; i++) {
			int stick = a[i];
			int count = 0;
			
			while(i+1<a.length && a[i+1]==stick ) {
				count++;
				i++;
			}
			
			if(count>=3) {
				height = stick;
				width = stick;
				
				br = true;
			}else if(count==1 || count==2) {
				if(height != 0) {
					width = stick;
					br = true;
				}else {
					height = stick;
				}
			}
			
			
			if(br) {
				break;
			}
		}
		
		System.out.println(height * width);
		
	}

}
