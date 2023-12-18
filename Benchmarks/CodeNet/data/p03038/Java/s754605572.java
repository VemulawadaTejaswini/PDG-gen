import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a=new int[n];
		int[][] bc=new int[m][2];
		long sum=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++){
			bc[i][0]=sc.nextInt();
			bc[i][1]=sc.nextInt();
		} 
		Arrays.sort(bc,Comparator.comparingInt(o->o[1]));
		LinkedList<Integer> D=new LinkedList<Integer>();
		outside:
		for(int i=m-1;i>=0;i--){
			for(int j=0;j<bc[i][0];j++){
				D.add(bc[i][1]);
				if(D.size()>n)
					break outside;
			}
		}	
		Arrays.sort(a);
		for(int i=0;i<D.size()&&i<n;i++){
			if(a[i]<D.get(i))
			a[i]=D.get(i);
		}
		for(int i=0;i<n;i++){			
			sum+=a[i];
		}
		System.out.println(sum);	
	}
}