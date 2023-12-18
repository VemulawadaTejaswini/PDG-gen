import java.util.*;
public class Main {
	public static void main(String[] args) { 
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int a=scn.nextInt();
			arr.add(a);
		}int ans=0;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr.get(i) < arr.get(k)+arr.get(j)) {
						if(arr.get(j) < arr.get(k)+arr.get(i)) {
							if(arr.get(k) < arr.get(i)+arr.get(j)) {
								ans++;
							}
						}
					}
				}
			}
		}System.out.println(ans);
    }
}