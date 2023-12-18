import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ID = sc.nextInt();
        int gate = sc.nextInt();

        int[] minid = new int[gate];
        int[] maxid = new int[gate];

        for(int i = 0;i<gate;i++){
          minid[i] = sc.nextInt();
          maxid[i] = sc.nextInt();
        }


        int max      = minid[0];

        for (int index = 1; index < minid.length; index ++) {
            max = Math.max(max, minid[index]);
        }

        int min = maxid[0];

        for (int j = 1; j < minid.length; j ++) {
            min = Math.min(min, maxid[j]);
        }

        System.out.println(min-max+1);


    }
}
