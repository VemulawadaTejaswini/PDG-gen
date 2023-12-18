//package atcoderdp;
import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a[][]= new int[n][3];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <3 ; j++) {
                a[i][j]=s.nextInt();
            }
        }
        int res = Math.max(Math.max(find(a,n,0,0,0),find(a,n,0,0,1)),find(a,n,0,0,2));
        System.out.println(res);
    }
    public static int find(int a[][],int n,int sum,int start,int index){
        if(start==n)
            return sum;
        else {
            return Math.max(find(a, n, sum + a[start][index], start + 1, (index + 1) % 3), (find(a, n, sum + a[start][index], start + 1, (index + 2) % 3)));
        }
    }
}
