import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i=0; i<n; i++) {
            int s = sc.nextInt();
            if (s%10!=0) l.add(s);
            sum += s;
        }
        
        if (sum%10==0){
            if (l.size()==0){
                System.out.println(0);
            }
            else {
                System.out.println(sum-l.get(0));
            }
        }
        else {
            System.out.println(sum);
        }
        //System.out.println("yes");
        sc.close();
    }
}