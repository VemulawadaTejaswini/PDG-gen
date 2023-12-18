import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long n = stdIn.nextLong();
        long k = stdIn.nextLong();
        ArrayList<Long> a = new ArrayList<Long>();
        for(int i = 0;i < n;i++) {
            a.add(stdIn.nextLong());
        }
        ArrayList<Long> x = new ArrayList<Long>();

        ArrayList<ArrayList<Long>> t = new ArrayList<ArrayList<Long>>();
        int p = -1;
        
        for(int m = 0;m < k;m++){
            x.addAll(a);

            // for(int j = 0;j < x.size();j++){
            //     System.out.print(x.get(j));
            // }
            // System.out.println();


            for(int i = 0;i < x.size();i++) {
                for(int j = 0;j < i;j++) {
                    if(x.get(i) == x.get(j)) {
                        x.subList(j, i+1).clear();
                        if(x.size() == 1 || x.size() == 0) {
                            break;
                        }
                        i = j-1;
                        break;
                    }
                }
            }

            // System.out.println("削除後");
            // for(int j = 0;j < x.size();j++){
            //     System.out.print(x.get(j));
            // }
            // System.out.println();
            
            t.add(new ArrayList<>(x));

            // System.out.println("追加後(0)");
            // for(int j = 0;j < t.get(0).size();j++){
            //     System.out.print(t.get(0).get(j));
            // }
            // System.out.println();

            

            if(x.isEmpty()){
                p = m;
                break;
            }
        }

        // for(int i = 0;i < t.size();i++){
        //     for(int j = 0;j < t.get(i).size();j++){
        //         System.out.print(t.get(i).get(j));
        //     }
        //     System.out.println();
        // }

        if(p == -1) {
            p = (int)(k-1);
        }
        int l = (int)(k % (p + 1) - 1);
        if(l == -1) {
            l = p;
        }
        x = t.get(l);

        for(int i = 0;i < x.size();i++) {
            System.out.print(x.get(i));
            if(i != x.size()){
                System.out.print(" ");
            }
        }
        System.out.println();



        
    }
}