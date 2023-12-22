import java.util.Arrays;
import java.util.Scanner;


public class Main {

	Scanner sc;
	
	int search(int[] array,int n,int l,int r,int d){
		++d;
		if(l>=r)return d;
		int m=(r+l)/2;
		if(array[m]>n)return search(array,n,l,m-1,d);
		else if(array[m]<n)return search(array,n,m+1,r,d);
		else return d;
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		sc=new Scanner(System.in);
		int[] array;
		
		int n;
		while((n=ni())!=0){
			array=new int[n];
			for(int i=0;i<n;++i){
				array[i]=ni();
			}
			int number=ni();
			System.out.println(search(array,number,0,n-1,0));
			
		}
		sc.close();
	}
	
	void debug(Object...os){
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}