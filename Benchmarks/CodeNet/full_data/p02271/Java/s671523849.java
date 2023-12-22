import java.util.Scanner;

public class Main{
    static int num;
    static int[] array;
    
    private static boolean check(int i, int m){
        if(m == 0) return true;
        if(i >= num) return false;
        return check(i + 1, m) || check(i + 1, m - array[i]);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        array = new int[num];
        for(int i = 0; i < num; i++){
            array[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int m = 0;
        for(int i = 0; i < q; i++){
            m = sc.nextInt();
            if(check(0, m)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        
    }
}
