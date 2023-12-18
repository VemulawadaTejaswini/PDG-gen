import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n-1];
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int tmp = 0;
        for(int i = 0;i < n-1;i++){
            b[i] = sc.nextInt();
            if(min > b[i]){
                min = b[i];
                tmp = i;
            }
            sum += b[i];
        }

        try{
            int change = Math.max(b[tmp-1],b[tmp+1]);
            sum = sum + change - min;
        }catch(Exception ex){
            if(tmp == 0){
                sum = sum + b[1] - min;
            }else{
                sum = sum + b[n-1] - min;
            }
        }
        
        System.out.println(sum);
    }
}