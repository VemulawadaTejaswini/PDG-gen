import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] px = new int[n];
        int[] py = new int[n];
        for(int i = 0;i < n;i++){
            px[i] = sc.nextInt();
            py[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for(int i = 0;i < q;i++){
            int x1 = sc.nextInt(),x2 = sc.nextInt(),y1 = sc.nextInt(),y2 = sc.nextInt();
            for(int j = 0;j < n;j++){
                if(x1 <= px[j] && px[j] <= x2 && y1 <= py[j] && py[j] <= y2){
                    System.out.println(j);
                }
            }
            System.out.println();
        }
        sc.close();
    }

}