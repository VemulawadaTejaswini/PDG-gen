import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt(); 
        }
        for(int i=n-1;i>=0;i--){
            if(i == 0) System.out.println(a[i]);
            else System.out.print(a[i] + " ");
        }
    }
}
