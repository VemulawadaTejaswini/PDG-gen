import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N<=100&&N>=1) {
		int temp;
		int array[]=new int[N];
		for(int i=0;i<N;i++){
			int a=sc.nextInt();
			if(a<=1000&&a>=0)
			{array[i]=a;}
			else break;
		}
		for(int i=1;i<N;i++){
			if(array[0]<array[i]){
				temp=array[0];
				array[0]=array[i];
				array[i]=temp;
			}
		}
		for(int i=0;i<N;i++){
			if(array[i]>array[1]){
				temp=array[1];
				array[1]=array[i];
				array[i]=temp;
			}
		}
		
		int distance=array[1]-array[0];
		System.out.println(distance);
		}
		
		}
	}
