import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(i==j) continue;
                if(a[i]==a[j]){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}