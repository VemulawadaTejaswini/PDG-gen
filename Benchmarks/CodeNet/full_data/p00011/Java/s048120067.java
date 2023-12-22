import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int w = sc.nextInt();
        int n = sc.nextInt();

        int[] line = new int[w];

        for(int k = 0; k < w; k++){
            line[k] = k + 1;
        }

        for(int i = 0; i < n; i++){
            String str = sc.next();
            String[] ab = str.split(",");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            int t = line[a-1];
            line[a-1] = line[b-1];
            line[b-1] = t;
        }

        for(int j = 0; j <= n; j++){
            System.out.println(line[j]);
        }

    }
}
