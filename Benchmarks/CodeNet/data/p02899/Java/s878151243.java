import java.util.*;
public class Main {
	public static void main(String[] args) { 
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int j=0;j<n;j++) {
			int h=scn.nextInt();
			arr.add(h);
		}ArrayList<Integer> ans=new ArrayList<Integer>();
		int sa=1;
		int j=0;
		while(true) {
			if(sa>arr.size()) {
				break;
			}
			if(arr.get(j)==sa) {
				ans.add(j+1);
				sa++;
				j=0;
			}else {
				j++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(ans.get(i)+" ");
		}
    }
}