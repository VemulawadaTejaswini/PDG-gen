import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        long ans = 0;
		long [] in = new long [n];
        for(int i=0;i<n;i++){in[i] = sc.nextLong();}
        Arrays.sort(in);
        for(int i=0;i<n-2;i++){
         for(int j=i+1;j<n-1;j++){
         int min = j;
         int max = n;
         int point = (min+max)/2;
         int size = point;               
        while(max-min>1){size = Math.max(point/2,1);
                         if(in[i]+in[j]<in[point]){min=point;point+=size;}
                         else{max=point;point-=size;}                
                        }
        ans+=min-j;
        }                              
                              }         
        System.out.println(ans);
	}
}