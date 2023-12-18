import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int m=0, f=0, t=0;
        try {
            for (int i = 0; i <= N; i++) {
                for (int j = 0; j <= N; j++) {
                    for (int k = 0; k <= N; k++) {
                        if( i+j+k == N) {
                            if(10000*i + 5000*j + 1000*k == Y) {
                                m = i; f = j; t = k;
                                throw new Exception();
                            }
                        }
                    }
                }
            }
            System.out.println("-1 -1 -1");
        } catch (Exception e) {
             System.out.println(m+" "+f+" "+t);
        }

//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < N; i++) {
//            list.add(sc.nextInt());
//        }
    }
}