import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l[] = new int[n];
        
        for(int i=0;i<n;i++){
            l[i]=sc.nextInt();
        }
        
        
        Arrays.sort(l);
        
        int count = 0;
        int min;
        int max;
        
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                max=l[i]+l[j];
                min=Math.abs(l[i]-l[j]);
                
                int a=0;
                int b=0;
                
                for(a=j+1;a<n;a++){
                    if(l[a]>min){
                        break;
                    }
                }
                
                for(b=n-1;b>a;b--){
                    if(l[b]<max){
                        break;
                    } 
                    
                }
                
                count+=b-a+1;
                if(l[a]<=min||l[b]>=max){
                    count--;
                }
                
                
            }
        }
        
        System.out.println(count);
        
    }
}
