import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] food = new int[n];
        int[] man = new int[n];
        int[] com = new int[n-1];
        int sum = 0;
        for(int i = 0;i < n;i++){
            food[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++){
            man[i] = sc.nextInt();
            sum += man[i];
        }
        for(int i = 0;i < n-1;i++){
            com[i] = sc.nextInt();
        }

        for(int i = 1;i < n;i++){
            if(food[i-1] == food[i]-1)
            sum += com[a[food[i-1]]];
        }
        System.out.println(sum);
    }
}