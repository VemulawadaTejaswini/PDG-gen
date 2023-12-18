import java.util.*;
 
 
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int t[] = new int[N+1];
        int x[] = new int[N+1];
        int y[] = new int[N+1];

        for(int i=1; i<=N; i++){
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        t[0] = 0;
        x[0] = 0;
        y[0] = 0;


        boolean flag = true;

        for(int i=0; i<N; i++){
            int dt = t[i+1] - t[i];
            int dist = Math.abs(x[i+1] - x[i]) + Math.abs(y[i+1] - y[i]);
            if(dt < dist) {
                flag = false;
                break;
            }
            if(dt%2 != dist%2){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}