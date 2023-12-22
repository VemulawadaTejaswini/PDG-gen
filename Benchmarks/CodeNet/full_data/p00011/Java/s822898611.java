import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int w = sc.nextInt();
            int n = sc.nextInt();
            int[] values = new int[w];
            for (int i = 0; i < values.length; i++) {
                values[i] = i;
            }
            for (int i = 0; i < n; i++) {
                String str = sc.next();
                String[] ab = str.split(",");
                int a = Integer.parseInt(ab[0]) - 1;
                int b = Integer.parseInt(ab[1]) - 1;
                for(int x=0;x<w;x++){
                    if(values[x]==a){
                        values[x] = b;
                        continue;
                    }else if(values[x]==b){
                        values[x] = a;
                        continue;
                    }
                }
            }
            for(int j = 0;j<w;j++){
                for(int k=0;k<w;k++){
                    if(values[k] == j){
                        System.out.println(k+1);
                    }
                }
            }
            sc.close();    
        }
    }
}

