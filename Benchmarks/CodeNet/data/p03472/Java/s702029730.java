import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int H = sc.nextInt();
        
        int[][] a = new int[2][N];

        int max = 0;
        for(int i = 0; i < N; i++){
            a[0][i] = sc.nextInt();
            a[1][i] = sc.nextInt();
            max = Math.max(max, a[0][i]);
        }
        sc.close();

        List<Integer> list = new ArrayList<>();
        long sum = 0;
        for(int i = 0; i < N; i++){
            if(max < a[1][i])
                sum += a[1][i];
            list.add(a[1][i]);
        }

        Collections.sort(list, Collections.reverseOrder());
        int count = 0;
        if((H-sum)%max == 0)
            count += (H-sum)/max;
        else
            count += (H-sum)/max+1;
        H -= count*max;
        int i = 0;
        while(H>0){
            H -= list.get(i);
            i++;
            count++;
        }
        System.out.println(count);
    }
}