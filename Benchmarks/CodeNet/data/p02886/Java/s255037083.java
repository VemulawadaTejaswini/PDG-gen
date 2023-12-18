import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] d = new int[N];
        for(int i=0;i<N;i++){
            d[i] = sc.nextInt();
        }

        int sum = 0;
        int tmp = 0;
        for(int i=0;i<d.length;i++) {
            for(int j=i+1;j<d.length;j++){
                tmp = d[i] * d[j];
                sum += tmp;
            }
        }

        System.out.println(sum);
        
    }
}