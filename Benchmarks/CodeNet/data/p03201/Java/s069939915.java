import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        boolean b[] = new boolean[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            b[i] = true;
        }

        int count=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j){
                    break;
                }else{
                    int num = a[i] + a[j];
                    if((num & (num-1)) == 0 && b[i] && b[j]){
                        count++;
                        b[i] = false;
                        b[j] = false;
                    }

                }
            }
        }

        System.out.println(count);

 
    }



}