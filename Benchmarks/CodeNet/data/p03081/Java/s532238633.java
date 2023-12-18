//エクサウィーズ2019-03-30 C
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
        String s = sc.next();
        int cnt = N;
        String[] sArray = s.split("");
        Integer a[] = new Integer[N];
        Arrays.fill(a,1);
        for(int i = 0; i < Q; i++){
            if(cnt==0){
                break;
            }
            String s1 = sc.next();
            String s2 = sc.next();
            for(int j = 0 ; j < N; j++){
                if(sArray[j].equals(s1)){
                    int sum = 0;
                    if(s2.equals("L")){
                        if(j == 0){
                            cnt -=a[j];
                            a[j]=0;
                        }else{
                            sum += a[j-1];
                            sum += a[j];
                            a[j] = 0;
                            a[j-1] = sum;
                        }
                    }else{  //Rの時
                        if(j == N-1){
                            cnt -= a[j];
                            a[j] = 0;
                        }else{
                            sum += a[j+1];
                            sum += a[j];
                            a[j] = 0;
                            a[j+1] = sum;
                        }
                    }
                    
                }
            }
        }
        if(cnt<0){
            cnt = 0;
        }
        System.out.println(cnt);
    }
}