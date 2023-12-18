import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int X=scan.nextInt();
        int cnt=0;
        int[] box=new int[X];
        for(int i=0;i<X;i++){
            box[i]=scan.nextInt();
        }
        for(int i=0;i<X;i++){
            for(int j=i+1;j<X;j++){
                if(box[i]+box[j] ==(i-j)*-1 ){
                    cnt++;
                }
            }
            //System.out.println(box[i]-box[j]);
        }
        System.out.println(cnt);
        
        
        
        
        
        
    }
}
