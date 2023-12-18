

import java.util.*;

class Main {

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i <n ; i++) {
            int a= s.nextInt();
            if(set.contains(a)){
                System.out.println("NO");
                return;
            }
            set.add(a);
        }
        System.out.println("YES");

    }

}