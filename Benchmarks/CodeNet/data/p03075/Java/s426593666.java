import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p = new int[5];
        for(int i=0;i<5;i++){
            p[i] = Integer.parseInt(sc.next());
        }
        int k = Integer.parseInt(sc.next());
        sc.close();
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(p[j]-p[i] > k){
                    System.out.println(":(");
                    return;
                }
            }
        }
        System.out.println("Yay!");

    }
    
}