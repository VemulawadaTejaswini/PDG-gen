import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] wei = new int[num];
        int sum = 0;
        int s1 = 0;
        for(int i = 0;i < num;i++){
            wei[i] = sc.nextInt();
            sum += wei[i];
        }
        Arrays.sort(wei);
        for(int i = 0;i < num/2;i++){
            s1 += wei[i];
        }
        int s2 = sum-s1;
        System.out.println(s2-s1);
    }
}