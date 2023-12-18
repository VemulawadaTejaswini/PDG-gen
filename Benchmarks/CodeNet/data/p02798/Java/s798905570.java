import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    static int n;
    static List<String> list;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0; i < n; i++){
            b[i] = Integer.parseInt(sc.next());
        }
        
        LinkedList<Integer> listA = new LinkedList<>();
        LinkedList<Integer> listB = new LinkedList<>();
        for(int i = 0; i < n; i++){
            listA.add(i);
        }
        list = new ArrayList<>();
        permutation(listA, listB);
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list.size(); i++){
            int count = 0;
            int[] x = new int[n];
            for(int j = 0; j < n; j++){
                int k = Integer.valueOf(list.get(i).substring(j, j+1));
                count += Math.abs(j-k);
                if(j%2 == k%2){
                    x[j] = a[k];
                }else{
                    x[j] = b[k];
                }
            }
            count /= 2;
            boolean ok = true;
            for(int j = 1; j < n; j++){
                if(x[j] < x[j-1]){
                    ok = false;
                    break;
                }
            }
            if(ok && count < min){
                min = count;
            }
        }
        
        if(min == Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(min);
        }
    }
    
    static void permutation(LinkedList<Integer> a, LinkedList<Integer> b){
        
        if(a.isEmpty()){
            String s = "";
            for(int i = 0; i < n; i++){
                s += b.get(i);
            }
            list.add(s);
            return;
        }
        
        for(int i = 0; i < a.size(); i++){
            b.addLast(a.removeFirst());
            permutation(a, b);
            a.addLast(b.removeLast());
        }
    }
}