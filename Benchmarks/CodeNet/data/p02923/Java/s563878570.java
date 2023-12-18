import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N=sc.nextInt();
        int i=0;
        int answer=0;
        int count=0;
        
        int H[] =new int[N];
        
        for(i=0;i<N;i++){
            H[i]=sc.nextInt();
            
        }
        
        for(int j=0;j<N-1;j++){
            i=j;
            while(i<=H[i] && H[i]>=H[i+1]){
                count+=1;
                i++;
                
            }
            
            if(answer<count){
                answer=count;
            }
            count=0;
        }
        
        System.out.println(answer);
        
        
        
        
        
        
    }
}
