import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] blue = new String[n];
        for (int i = 0;i < n;++i){
            blue[i] = sc.next();
        }
        int m = sc.nextInt();
        String[] red = new String[m];
        for (int i = 0;i < m;++i){
            red[i] = sc.next();
        }
        int max = 0;
        for (int i = 0;i < n;++i){
            if(blue[i] == null){
                continue;
            }
            int k = 1;
            for (int j = 0;j < n;++j){
                if(i == j)continue;
                if(blue[j]!=null&&blue[i].equals(blue[j])){
                    ++k;
                    blue[j] = null;
                }
            }
            for (int j = 0;j < m;++j){
                if(red[j]!=null&&blue[i].equals(red[j])){
                    --k;
                    red[j] = null;
                }
            }
            if(k > max)max = k;
            blue[i] = null;
        }
        System.out.println(max);

    }



}