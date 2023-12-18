import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int list[] = new int[n];
        int list2[] = new int[n];
        for(int i=0; i< n; i++){
            list[i]= sc.nextInt();
            list2[i] = list[i];
        }
        Arrays.sort(list);
        for(int k=0; k<n; k++){
        if(list2[k] != list[n-1]){
            System.out.println(list[n-1]);
        }else if(list2[k] == list[n-1]){
                System.out.println(list[n - 2]);
            }
        }
    }
}
