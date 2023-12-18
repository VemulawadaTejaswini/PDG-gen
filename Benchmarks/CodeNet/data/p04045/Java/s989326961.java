import java.util.*;

public class Main {
	public static boolean fanc(int number,ArrayList<Integer> D) {
		int num=number;
		while(num>0) {
			int N=num%10;
			if(D.contains(N))
				return true;
			num/=10;
		}
		return false;
	}
	
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int N=sc.nextInt();
		 int K=sc.nextInt();
		 ArrayList<Integer> D=new ArrayList<>();
		 for(int i=0;i<K;i++) {
			 D.add(sc.nextInt());
		 }
	     sc.close();
	     
	     int ans=0;
	     for(int count=N;count<10000;count++) {
	    	 if(!fanc(count,D)) {
	    		 ans=count;
	    		 break;
	    	 }
	     }
	     System.out.println(ans);
	 }
}