import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();      
		int o=0;
      	int[] b=new int[n-1];
        //PriorityQueue<Integer> num=new PriorityQueue<>();
        for(int i=0;i<n-1;i++){
        	b[i]=sc.nextInt();
        }
        o+=b[0];
        for(int i=1;i<n-1;i++){
            int m=Math.min(b[i],b[i-1]);
        	o+=m;
     	}
        o+=b[n-2];
      	System.out.println(o);
    }  
 
}