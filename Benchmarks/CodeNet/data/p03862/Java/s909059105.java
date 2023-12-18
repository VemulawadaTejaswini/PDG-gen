import java.util.Scanner;

public class Main{

    private static int x;
    private static int[] a;
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        x = scan.nextInt();
        a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scan.nextInt();
        }
        int cnt = 0;
        while(chk()){
            for(int i=1; i<a.length; i++){
                if(a[i-1] + a[i] > x){
                    if(a[i] > 0){
                        a[i]--;
                    }else{
                        a[i-1]--;
                    }
                    cnt++;
                    break;
                }
            }
        }
        
        System.out.println(cnt);

        scan.close();
    }
    private static boolean chk(){
        for(int i=1; i<a.length; i++){
            if(a[i-1] + a[i] > x) return true;
        }
        return false;
    }
}