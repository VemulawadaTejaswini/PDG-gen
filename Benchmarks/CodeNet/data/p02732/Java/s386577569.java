import java.util.*;
 
public class Main {
        public static void sort(int array[], int left, int right){
        if(left <= right){
            int p = array[(left + right) >>> 1];
            int l = left;
            int r = right;
            while(l <= r){
                while (array[l] < p){
                    l++;
                }
                while (array[r] > p){
                    r--;
                }
                if (l <= r){
                    int tmp = array[l];
                    array[l] = array[r];
                    array[r] = tmp;
                    
                    l++;
                    r--;
                }
            }
            Main.sort(array, left, r);
            Main.sort(array, l, right);
        }
    }
    
    
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        int n = stdIn.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        
        for(int i = 0; i < n; i++){
            a[i] = stdIn.nextInt();
            b[i] = a[i];
        }
        
        sort(a, 0, n - 1);
        
        List<Integer> list = new ArrayList<Integer>();
        
        boolean flag = false;
        int keep = 0;
        for(int i = 0; i < n - 1; i++){
            if(flag){
                if(keep == a[i]){
                    flag = false;
                }else{
                    list.add(keep);
                    keep = a[i];
                }
            }else{
                keep = a[i];
                flag = true;
            }
        }
        
        if(flag){
            if(keep != a[n - 1]){
                list.add(keep);
                list.add(a[n - 1]);
            }
        }else{
            list.add(a[n - 1]);
        }
        
        for(int i = 0; i < n; i++){
            boolean chack = list.contains(b[i]);
            if(chack){
                System.out.println((n - list.size()) / 2);
            }else{
                System.out.println((n - list.size()) / 2 + 1);
            }
        }
        
        
        //int c = stdIn.nextInt();
        //int x = stdIn.nextInt();
        
        
        
        
        // for(int i = 0; i < s.length(); i++){
        //     a[i] = c[i] - 48;
        //     System.out.println(a[i]);
        // }
        //int sum = 0;
        //boolean flag = true;
        //for(int i = 0; i < s.length(); i++){
        //}
        
        // if(flag){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }
        
 
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}