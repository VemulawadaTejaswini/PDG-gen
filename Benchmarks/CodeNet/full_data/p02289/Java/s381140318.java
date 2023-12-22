//import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public int[] link;
    private int curr;
    public int size=3000000;
     
    public Main() {
        this.link= new int[size];
        this.curr=0;
    }
     
    public void insert(int k) {
        this.link[curr]=k;
        this.curr++;
        int m =curr;
        //System.out.println(m);
        while ((m>=2)&&(this.link[m-1]>=this.link[m/2-1])) {
            //System.out.println(m);
            this.link[m-1]=this.link[m/2-1];
            this.link[m/2-1]=k;
            m=m/2;
        }
    }
     
    public void maxHeap(int[] a,int i) {
        int l = this.link[2*i-1];
        int r = this.link[2*i];
        int par = this.link[i-1];
        int largest=i;
        if ((2*i<=curr)&&(l>par)) {
            largest = 2*i;
        }
         
        if ((2*i+1<=curr)&&(r>this.link[largest-1])){
            largest = 2*i+1;
        }
        if (largest != i) {
            int m = this.link[i-1];
            this.link[i-1]=this.link[largest-1];
            this.link[largest-1]=m;
            this.maxHeap(this.link,largest);
        }   
    }
     
    //public void buildMaxHeap(int[] m) {
    //  for (int i=(curr+1)/2;i>0;i--) {
    //      this.maxHeap(m,i);
    //  }
    //}
 
     
    public int extract() {
        //this.buildMaxHeap(this.link);
        //System.out.println(Arrays.toString(this.link));
        int t = this.link[0];
        if (curr>0) {
            this.link[0]=this.link[--curr];
        }
        this.link[curr]=0;
        //System.out.println(Arrays.toString(this.link));
        this.maxHeap(this.link, 1);
        //System.out.println(Arrays.toString(this.link));
        return t;
         
    }
     
    public static void main(String[] wjy) {
        Scanner sc = new Scanner(System.in);
        Main lk = new Main();
        boolean suit =true;
        while (suit) { 
            String a = sc.next();
            if (a.equals("end")) {
                suit = false;
            }
            else if(a.equals("extract")) {
                System.out.println(lk.extract());
            }
            else {
                int j=(int) sc.nextInt();
                lk.insert(j);
            }
        }
        sc.close();
    }
}
