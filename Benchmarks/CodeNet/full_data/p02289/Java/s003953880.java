import java.util.Scanner;

public class Main {
    
    static int[] a;
    static int h;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        a = new int[2000000];
        h = 0;
        StringBuilder sb = new StringBuilder();
        while(true){
            String s = sc.next();
            if(s.equals("insert")){
                insert(Integer.parseInt(sc.next()));
            }else if(s.equals("extract")){
                sb.append(heapExtractMax()).append(System.lineSeparator());
            }else if(s.equals("end")){
                break;
            }
        }
        
        System.out.print(sb);
    }
    
    static void insert(int key){
        
        h++;
        a[h] = Integer.MIN_VALUE;
        heapIncreaseKey(h, key);
    }
    
    static void heapIncreaseKey(int i, int key){
        
        if(key < a[i]) return;
        a[i] = key;
        while(i > 1 && a[i/2] < a[i]){
            int tmp = a[i/2];
            a[i/2] = a[i];
            a[i] = tmp;
            i = i/2;
        }
    }
    
    static int heapExtractMax(){
        
        if(h < 1) return Integer.MIN_VALUE;
        int max = a[1];
        a[1] = a[h];
        h--;
        maxHeapify(1);
        
        return max;
    }
    
    static void maxHeapify(int i){
        
        int l = i*2;
        int r = i*2+1;
        int largest;
        
        if(l <= h && a[l] > a[i]){
            largest = l;
        }else{
            largest = i;
        }
        if(r <= h && a[r] > a[largest]){
            largest = r;
        }
        
        if(largest != i){
            int tmp = a[i];
            a[i] = a[largest];
            a[largest] = tmp;
            maxHeapify(largest);
        }
    }
}
