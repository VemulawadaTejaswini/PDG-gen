import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int people = sc.nextInt();
        int[] count = new int[people];
        int[] candies = new int[num];
        int[] reminders = new int[num + 1];
        for(int i = 0; i < candies.length; i++) {
            candies[i] = sc.nextInt();
        }
        for(int i = 1; i < candies.length; i++) {
            if(i == 0) continue;
            reminders[i] = (candies[i-1] + candies[i]) % people;
        }
        for(int i = 0; i < reminders.length; i++) {
            count[reminders[i]]++;
        }
        long ans = 0;
        for(int n: count) {
            ans += (n * (n-1))/2;
        }
        System.out.println(ans);
    }
}