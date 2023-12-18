import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        PriorityQueue<Elements> queue = new PriorityQueue(10000);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        long a[] = new long[x];
        long b[] = new long[y];
        long c[] = new long[z];
        
        for(int i = 0; i < x; i++){
            a[i] = sc.nextLong();
        }
        for(int i = 0; i < y; i++){
            b[i] = sc.nextLong();
        }
        for(int i = 0; i < z; i++){
            c[i] = sc.nextLong();
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        
        int xi = 1;
        int yi = 1;
        int zi = 1;
        
        queue.add(new Elements(a[a.length - xi] + b[b.length - yi] + c[c.length - zi], xi, yi, zi));
        for(int i = 0; i < k; i++){
            Elements e = queue.poll();
            System.out.println(e.value);
            xi = e.x;
            yi = e.y;
            zi = e.z;
            if(xi + 1 <= a.length){
                Elements e1 = new Elements(a[a.length - (xi + 1)] + b[b.length - yi] + c[c.length - zi], xi + 1, yi, zi);
                if(!queue.contains(e1)){
                    queue.add(e1);
                }
            }
            if(yi + 1 <= b.length){
                Elements e2 = new Elements(a[a.length - xi] + b[b.length - (yi + 1)] + c[c.length - zi], xi, yi + 1, zi);
                if(!queue.contains(e2)){
                    queue.add(e2);
                }
            }
            if(zi + 1 <= c.length){
                Elements e3 = new Elements(a[a.length - xi] + b[b.length - yi] + c[c.length - (zi + 1)], xi, yi, zi + 1);
                if(!queue.contains(e3)){
                    queue.add(e3);
                }
            }
            
        }
    }
    
    public static class Elements implements Comparable{
        public long value;
        public int x;
        public int y;
        public int z;
        
        Elements(long v, int xn, int yn, int zn){
            value = v;
            x = xn;
            y = yn;
            z = zn;
        }
        
        public long getValue(){
            return this.value;
        }
        
        @Override
        public boolean equals(Object obj){
            if(obj instanceof Elements){
                Elements oe = (Elements)obj;
                if(this.x == oe.x && this.y == oe.y && this.z == oe.z){
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public int compareTo(Object obj){
            if(obj instanceof Elements){
                Elements e = (Elements)obj;
                if(e.value < this.value){
                    return -1;
                }
                if(e.value >= this.value){
                    return 1;
                }
            }
            return 1;
        }

    }
}
