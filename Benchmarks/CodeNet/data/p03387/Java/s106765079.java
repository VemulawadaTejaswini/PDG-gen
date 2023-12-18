import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = A + B + C;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(A);
        list.add(B);
        list.add(C);
        Collections.sort(list);

        if(sum%2==list.get(2)%2){
            System.out.println((list.get(2) - list.get(1) + list.get(2) - list.get(0)) / 2);
        }
        else if(sum%2!=list.get(2)%2){
            System.out.println((list.get(2) - list.get(1) + list.get(2) - list.get(0) + 1) / 2 + 1);
        }
    }
}