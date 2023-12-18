import java.util.*;


class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int all = sc.nextInt()-1;
        sc.nextLine();
        int[] w = new int[all+1];
        int result=0;


        for(int i = 0; i<all; i++){
            w[i] = sc.nextInt();
        }
        for(int i = 0; i<all; i++){
            if(!(nibun(all,i,w))){result=i-1;}

        }

        int mae2=0;
        int ato2=0;
        int mae3=0;
        int ato3=0;
        int result_ = result-1;
        for(int i=0; i<result; i++){
            mae2 += w[i];
        }
        for(int i=0; i<all-result; i++){
            ato2 += w[i+result];
        }

        for(int i=0; i<result_; i++){
            mae3 += w[i];
        }
        for(int i=0; i<all-result_; i++){
            ato3 += w[i+result_];
        }

        sc.close();
        int alpha = Math.min(Math.abs(mae3-ato3),Math.abs(mae2-ato2));
        System.out.println(alpha);



    }

    public static boolean nibun(int all, int t, int[] w){
        int mae=0;
        int ato=0;
        for (int i = 0; i<t; i++){
            mae += w[i];
        }
        for (int i = 0; i<all-t; i++){
            ato += w[i+t];
        }
        System.out.println(mae-ato);
        return mae<ato;
    }
}