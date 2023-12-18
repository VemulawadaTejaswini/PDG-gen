import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Plan[] plan = new Plan[n];

        for(int i = 0; i<n; i++) {
            plan[i] = new Plan(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(plan, (ca,cb)->(ca.b - cb.b));

        long total = 0;
        for(int i = 0; i<n; i++) {
            total += plan[i].a;
            if(plan[i].b<total) {
                System.out.println("No");
                return;
            }
            if(total > 1000000000) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}
class Plan {
    int a,b;
    public Plan(int a, int b) {
        this.a = a;
        this.b = b;
    }
}