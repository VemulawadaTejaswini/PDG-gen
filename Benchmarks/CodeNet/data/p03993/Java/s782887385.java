import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N=sc.nextInt();
        int[] a=new int[N];
        
        int count=0;
        
        
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt()-1;
            
        }
        for(int i=0;i<N;i++) {
			if(i==a[a[i]]){
			    count+=1;
			}
		}
        
        System.out.println(count/2);
        
        
        
        
    }
}
