import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] time = new int[N];
        int[] x = new int[N];
        int[] y = new int[N];
        int sumtime = 0;
        boolean jud = true;
        for(int i = 0; i<N;i++){
            time[i] = sc.nextInt();
        }
        for(int i = 0; i<N;i++){
            x[i] = sc.nextInt();
        }
        for(int i = 0; i<N;i++){
            y[i] = sc.nextInt();
        }
        sumtime = time[0];
        if(time[0] % (x[0]+y[0]) == 0){
            for(int i = 0;i < N-1;i++){
                sumtime += time[i+1];
                if(sumtime % (x[i+1]+y[i+1]) != 0){
                    jud = false;
                    break;
                }
            }
            if(jud == true){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }

        
    }
}