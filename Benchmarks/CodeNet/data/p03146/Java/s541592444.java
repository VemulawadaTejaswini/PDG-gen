import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[1000000];
        a[0] = sc.nextInt();

        boolean equalFlag = false;
        int ans = 0;
        for(int i = 0;i<1000000;i++){
            if(a[i] % 2 == 0){
                a[i+1] = a[i]/2;
            }else{
                a[i+1] = a[i]*3+1;
            }
            for(int j = 0;j<i+1;j++){
                if(a[i+1] == a[j]){
                    equalFlag = true;
                    ans = i+2;
                    break;
                }
            }
            if(equalFlag == true){
                break;
            }
        }

        System.out.println(ans);
    }
}