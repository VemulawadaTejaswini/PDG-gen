import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int index=0;
		int max=0;
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
			if(Math.abs(max)<Math.abs(a[i])){
				max=a[i];
				index=i;
			}
		}
		ArrayList<String> list=new ArrayList<>();
		if(max<0){
			for(int i=0; i<n; i++){
				if(a[i]>=0){
					a[i]+=max;
					list.add((index+1)+" "+(i+1));
				}
			}
		}else{
			for(int i=0; i<n; i++){
				if(a[i]<0){
					a[i]+=max;
					list.add((index+1)+" "+(i+1));
				}
			}
		}
		System.out.println(list.size()+n-1);
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		if(max<0){
			for(int i=n-1; i>0; i--){
				System.out.println((i+1)+" "+i);
			}
		}else{
			for(int i=0; i<n-1; i++){
				System.out.println((i+1)+" "+(i+2));
			}
		}
	}
}
