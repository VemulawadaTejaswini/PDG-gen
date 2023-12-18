import java.util.*;
public class Main {
    public static int sub(int[] lst, int n, int p){
        int pivot = lst[0];
        int sm = 1;
        int eq = 1;
        for(int i = 1; i < n; i++){
            if(lst[i]==pivot){
                int sub1 = lst[eq];
                lst[eq] = lst[i];
                lst[i] = sub1;
                eq++;
                sm++;
            }else if(lst[i]<pivot){
                int sub2 = lst[sm];
                lst[sm] = lst[i];
                lst[i] = sub2;
                sm++;
            }
        }
        int[] slst = new int[sm-eq];
        int[] blst = new int[n-sm];
        for(int i = 0; i < sm-eq; i++){
            slst[i] = lst[eq+i];
        }
        for(int i = 0; i < n-sm; i++){
            blst[i] = lst[sm+i];
        }
        if(sm-eq < p+1 && p+1 <= sm){
            return pivot;
        }else if(p+1 <= sm-eq ){
            return sub(slst,sm-eq,p);
        }else{
            return sub(blst,n-sm,p-sm);
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        int n = Integer.parseInt(scan.next());
        int lst[] = new int[n];
        for(int i = 0; i < n; i++){
            lst[i] = Integer.parseInt(scan.next());
        }
        a = sub(lst,n,n/2-1);
        b = sub(lst,n,n/2);
        System.out.println(b-a);
    }
}