import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long output = 1;
        boolean[] use = new boolean[1000];
        use[0]=true;
        long tmp=0;
        for(int i=0;i<n;i++){
            if(use[i])continue;
            for(int j=i;j<1000;j+=(i+1)){
                use[j]=true;
            }
            for(int j=1;j<Math.log(1000)/Math.log(i+1);j++){
                tmp+=n/Math.pow(i+1, j);
            }
            output*=tmp+1;
            output%=1000000007;
            tmp=0;
        }
        System.out.println(output);
    }
}