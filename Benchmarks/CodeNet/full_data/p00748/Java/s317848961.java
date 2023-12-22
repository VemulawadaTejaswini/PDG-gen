import java.util.Scanner;


public class Main {
    static Scanner s = new Scanner(System.in);
    static Pollock[] pol = new Pollock[1000000];
    static int count=0;

    static class Pollock{
        int all;
        int odd;

        Pollock(int all, int odd) {
            this.all = all;
            this.odd = odd;
        }
    }

    public static void main(String[] args) {
        pol[0]=new Pollock(0,0);
        while (true) {
            int N = s.nextInt();
            if (N == 0) break;

            if(N>count)
                calc(N);

            System.out.println(pol[N].all+" "+pol[N].odd);
        }
    }

    public static void calc(int N){
        while(count<N){
            calc_min(++count);
        }

    }

    public static void calc_min(int count){
        int i=1;
        int min_all=pol[count-1].all+1;
        int min_odd=pol[count-1].odd+1;

        while(true){
            i++;
            int tetrahedron=i*(i+1)*(i+2)/6;
            if(tetrahedron>count) break;

            min_all=Math.min(min_all,pol[count-tetrahedron].all+1);
            if(tetrahedron%2==1)
                min_odd=Math.min(min_odd,pol[count-tetrahedron].odd+1);
        }
        pol[count]=new Pollock(min_all,min_odd);
    }
}