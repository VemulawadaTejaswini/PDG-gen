import java.util.*;
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(),n=sc.nextInt();
        long ans = 0;
        int count = 0;
        while(count<n){
            ans ++;
            boolean marker = true;
            long tmp = ans;
            for(int i = 0;i<d;i++){
                if(tmp%100==0){
                    tmp/=100;
                } else {
                    marker =false;
                    break;
                }
            }
            if(marker&&tmp%100!=0){
                count ++;
            }
        }
        System.out.println(ans);
    }
}
