import java.util.ArrayList;
import java.util.*;
public class Main {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		int n=sc.nextInt();
		for (int i=0;i<n;i++){
			int temp=sc.nextInt();
			if(a.indexOf(temp)==-1){
				a.add(temp);
			}
		}
		int l=a.size();
		if(l%2==0){
			System.out.println(l-1);
		}
		else{
			System.out.println(l);
		}
			
	}

}