import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        char[] qc = sc.next().toCharArray();
        int data[] = new int[n+1];
        for(int i = 1;i<n;i++){
            if(qc[i-1] == 'A' && qc[i] == 'C'){
                data[i] = data[i-1] + 1;
            }else{
                data[i] = data[i-1];
            }
        }
        int l[] = new int[q];
        int r[] = new int[q];
        for(int i = 0;i<q;i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
            sc.nextLine();
        }
        for(int i = 0;i<q;i++){
            System.out.println(data[r[i]-1] - data[l[i]-1]);
        }
    }
}