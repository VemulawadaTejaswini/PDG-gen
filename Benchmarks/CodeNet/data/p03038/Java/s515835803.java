import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a=new int[n];
		int[][] bc=new int[m][2];
		long sum=0L;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++){
			bc[i][0]=sc.nextInt();
			bc[i][1]=sc.nextInt();
		} 
		Arrays.sort(bc,Comparator.comparingInt(o->o[1]));
		LinkedList<Integer> D=new LinkedList<Integer>();
	/*	outside:
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
		}	*/
		
		int x=0;
		int y=0;
		int max=0;
		for(int i=0;i<n;i++){
			if(x!=m)
				if(a[i]<bc[m-1-x][1]&&y==0){
					y=bc[m-1-x][0];
					x++;
				}
			if(x==0)
				max=1;
			if(a[i]>=bc[m-max-x][1]||y==0)
				sum+=a[i];
			else{
				sum+=bc[m-max-x][1];
				y--;
			}
			max=0;
		}
		System.out.println(sum);	
	}
}