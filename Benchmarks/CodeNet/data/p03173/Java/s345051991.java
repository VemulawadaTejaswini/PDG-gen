import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>nums = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            nums.add(sc.nextInt());
        }
        int cost=0;
        while (nums.size()>1){
            int mincos=Integer.MAX_VALUE;
            int minpos=1;
            for (int i=1;i<nums.size();i++){
                if((nums.get(i)+nums.get(i-1))<=mincos){
                   mincos=nums.get(i)+nums.get(i-1);
                   minpos=i;
                }
            }
            cost+= nums.get(minpos)+nums.get(minpos-1);
            nums.add(minpos-1,nums.get(minpos)+nums.get(minpos-1));
            nums.remove(minpos-1);
            nums.remove(minpos-1);
        }
        System.out.println(cost);
    }
}