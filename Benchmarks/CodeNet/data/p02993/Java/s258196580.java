import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[]a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        String ans = Jud(a);
        System.out.println(ans);
    }

    private static String Jud(int a[]){
        String ans = "Good";
        for(int i = 0; i < 3; i++){
            if(a[i] == a[i + 1]){
                ans = "Bad";
            }
        }
        return ans;
    }
}