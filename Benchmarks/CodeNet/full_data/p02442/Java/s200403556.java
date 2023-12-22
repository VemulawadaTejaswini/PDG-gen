import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i = 0;i < m;i++){
            b[i] = sc.nextInt();
        }

        int i = 0;
        while(true){
            if(i >= b.length){
                System.out.println("0");
                break;
            }
            if(i >= a.length){
                System.out.println("1");
                break;
            }
            if(a[i] > b[i]){
                System.out.println("0");
                break;
            }
            if(a[i] < b[i]){
                System.out.println("1");
                break;
            }
            i++;
        }
    }
}
