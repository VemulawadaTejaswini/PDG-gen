import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();

        for(int i = 0; i < n ; i++){
            l.add(sc.nextInt());
        }
        int max = 0;
        int t = 0;
        boolean loop;
        do {
            loop = false;
            for (int i = 0; i < n; i++) {
                if (l.get(i) % 2 == 0) {
                    loop = true;
                    t++;
                    for (int j = 0; j < n; j++) {
                        if (i == j) {
                            l.set(i, l.get(i) / 2);
                        } else {
                            //l.set(i, l.get(i) * 3);
                        }
                    }
                    i = 0;
                }
            }
            if(max < t ) {
                max = t;
            }
        }while(loop);
        System.out.println(max);
    }
}