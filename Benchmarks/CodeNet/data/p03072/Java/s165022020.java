import java.util.*;

 
class Main {
 
    private static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {

        int n = Integer.parseInt(sc.next());
        int h[]= new int[n];

        for(int i=0;i<n;i++){
            h[i]=Integer.parseInt(sc.next());
        }
        int ans=0;
        int high=h[0];
        for(int curr:h){
            if(high<=curr){
                ans+=1;
                high=curr;
            }
        }
        System.out.println(ans);
    }
}