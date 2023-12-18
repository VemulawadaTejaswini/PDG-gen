import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int n=stdin.nextInt();
		int h=stdin.nextInt();
		int a[]=new int [n];
		int b[]=new int [n];

//		System.out.println(a.length);

		for(int i=0;i<n;i++){
			a[i]=stdin.nextInt();
			b[i]=stdin.nextInt();
		}
		stdin.close();
		int max=0;
		List<Integer> bover=new ArrayList<>();
		int turn=0;
		for(int i=0;i<n;i++){
			max=Math.max(max, a[i]);
		}
		for(int i=0;i<n;i++){
			if(max<b[i])
				bover.add(b[i]);
		}
		Collections.sort(bover,Collections.reverseOrder());

		for(int i=0;i<bover.size();i++){
			if(h<=0){
				System.out.println(turn);
				return;
				}
			turn++;
			h=h-b[i];
			}
		while(h>0){
			h=h-max;
			turn++;
		}
		System.out.println(turn);
	}
}