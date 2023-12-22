import java.util.*;

public class Main {
    
    Scanner sc = new Scanner(System.in);
    
    void run(){
        int[] lst = init();
        System.out.println(count(lst));
    }
    
    int[] init(){
        int n = sc.nextInt();
        int[] lst = new int[n+2];
        for(int i=0;i<n+2;i++){
            if(i==0 || i==n+1) lst[i]=0;
            else lst[i]=sc.nextInt();
        }
        return lst;
    }
    
    int count(int[] lst){
        int ans = 0 , rec0 = 0;
        for(int i=0;i<lst.length;i++){
            if(lst[i]==0){
                ans = Math.max(ans,i-rec0);
                rec0 = i;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}
