import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int C = sc.nextInt();
        char[] l;
        String temp = sc.next();
        l = temp.toCharArray();

        if(countDays(l, C) < K) {
            return;
        }
        
        char[] r = new char[l.length];
        for (int i = 0; i < l.length; i++) {
            r[i] = l[N-i-1];
        }
        int[] li = count(l,C);
        int[] ri = count(r,C);
        
        for (int i = 0; i < r.length; i++) {
            
            if(li[i]+ri[N-i-1] < K){
                System.out.println(i+1);
            }
        }
    }
    public static int[] count(char[] c, int C){
        int count = 0;
        int[] arr = new int[c.length];
        for (int i = 1; i < c.length; i++) {
            if(c[i-1] == 'o'){
                count += 1;
                Arrays.fill(arr,i,Math.min(i+C+1,c.length), count);
                i += C;
                
            }else arr[i] = count;
        }
        // for (int i : arr) {
        //     System.out.print(i);
        // }
        // System.out.println(" ");
        return arr;
    }

    public static int countDays(char[] arr, int C){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 'o'){
                count++;
                i += C;
            }
        }
        return count;
    }

}