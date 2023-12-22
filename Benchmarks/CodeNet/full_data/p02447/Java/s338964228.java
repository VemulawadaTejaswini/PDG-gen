import java.util.Scanner;

public class Main {
    
    public static void sort(int array[], int array2[], int left, int right){
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
                    
                    int tmp2 = array2[l];
                    array2[l] = array2[r];
                    array2[r] = tmp2;
                    l++;
                    r--;
                }
            }
            Main.sort(array, array2, left, r);
            Main.sort(array, array2, l, right);
        }
    }
    
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        //int x = stdIn.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        //int sum = 0;
        //boolean flag = true;
        for(int i = 0; i < n; i++){
            a[i] = stdIn.nextInt();
            b[i] = stdIn.nextInt();
        }
        
        Main.sort(a, b, 0, n - 1);
        
        //int q = stdIn.nextInt();
        
        for(int i = 0; i < n; i++){
            int index = 0;
            for(int j = i; j < n; j++){
                if(j < n - 1){
                    if(a[j] != a[j + 1]){
                        index = j;
                        //System.out.println("a" + i + " " + j);
                        Main.sort(b, a, i, j);
                        i = j + 1;
                    }
                }else if(j == n - 1 && n != 1){
                    if(a[j] == a[j - 1]){
                        index = j;
                        //System.out.println("a" + i + " " + j);
                        Main.sort(b, a, i, j);
                        i = j + 1;
                    }
                }
            }
            
        }
        
        for(int i = 0; i < n; i++){
            System.out.println(a[i] + " " + b[i]);
        }
        

        //System.out.println();
        //System.out.print();

        stdIn.close();
    }
}



