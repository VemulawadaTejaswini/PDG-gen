import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String [] Mark = new String[N];
        String [] Mark_bubble = new String[N];
        int [] Num = new int[N];
        int [] Num_B = new int[N];
        boolean  check = true;
        for(int i=0;i<N;i++){
            String now = sc.next();
            String mark  = String.valueOf(now.charAt(0));
            Mark[i] = mark;
            Mark_bubble[i] = mark;
            int num = Character.getNumericValue(now.charAt(1));
            Num[i] = num;
            Num_B[i] = num;
        }
        for(int i=0;i<N;i++){
            for(int j=N-1;j>=i+1;j--){
                if(Num_B[j-1]>Num_B[j]){
                    int min = Num_B[j];
                    String min_mark = Mark_bubble[j];
                    Num_B[j] = Num_B[j-1];
                    Mark_bubble[j] = Mark_bubble[j-1];
                    Num_B[j-1] = min;
                    Mark_bubble[j-1] = min_mark;
                }
            }
        }
        for(int i=0;i<N;i++) {
            System.out.print(Mark_bubble[i]+Num_B[i]);
            if(i<N-1) System.out.print(" ");
        }
        System.out.println();
        System.out.println("Stable");
        for(int i=0;i<N-1;i++){
           int min = i;
            for(int j=i+1;j<N;j++) if(Num[min]>Num[j]) min = j;
            int num = Num[min];
            String mark = Mark[min];
            Num[min] = Num[i];
            Mark[min] =Mark[i];
            Num[i] = num;
            Mark[i] = mark;
        }
        for(int i=0;i<N;i++) if(Mark[i]!=Mark_bubble[i]) check = false;
        for(int i=0;i<N;i++) {
            System.out.print(Mark[i]+Num[i]);
            if(i<N-1) System.out.print(" ");
        }
        System.out.println();
        if(check) System.out.println("Stable");
        else System.out.println("Not stable");
    }
}
