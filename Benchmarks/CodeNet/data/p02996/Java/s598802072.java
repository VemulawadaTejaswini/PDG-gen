import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] ab=new int[n][2];
		int time=0;
		ArrayList<Integer> c=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			ab[i][0]=sc.nextInt();
			ab[i][1]=sc.nextInt();
		}
		int min=ab[0][1];
		for(int i=0;i<n;i++){
			if(Arrays.asList(c).contains(i)){
			}else{
				if(min>ab[i][1])
					min=ab[i][1];
			}
		}
		for(int i=0;i<n;i++){
			if(min==ab[i][1]){
				time+=ab[i][0];
				c.add(i);
				if(time>ab[i][1]){
					System.out.println("No");
					return;
				}

			}
		}
		System.out.println("Yes");
	}
		
}