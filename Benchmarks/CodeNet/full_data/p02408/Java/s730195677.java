import java.util.Scanner;

public class Main {
    public static void maon(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] s = new int[13];
        int[] h = new int[13];
        int[] c = new int[13];
        int[] d = new int[13];

        for(int i = 0; i < 13; i++){
            s[i] = 0;
            h[i] = 0;
            c[i] = 0;
            d[i] = 0;
        }

        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            String mark = sc.next();
            int rank = sc.nextInt();

            if(mark.equals("S"))
                s[rank - 1] = 1;
            if(mark.equals("H"))
                h[rank - 1] = 1;
            if(mark.equals("C"))
                c[rank - 1] = 1;
            if(mark.equals("D"))
                d[rank - 1] = 1;
        }

        for(int i = 0; i< num; i++){
            if(s[i] == 0)
                System.out.println("S " + i + 1);
        }
        for(int i = 0; i< num; i++){
            if(h[i] == 0)
                System.out.println("H " + i + 1);
        }
        for(int i = 0; i< num; i++){
            if(c[i] == 0)
                System.out.println("C " + i + 1);
        }
        for(int i = 0; i< num; i++){
            if(d[i] == 0)
                System.out.println("D " + i + 1);
        }

        sc.close();
    }
}
