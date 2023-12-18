import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m=sc.nextInt();
        int[] count = new int[n];
        for(int i =0;i<2*m;i++){
            count[sc.nextInt()-1]++;
        }
        for(int i = 0;i<n;i++){
            System.out.println(count[i]);
        }
    }
}