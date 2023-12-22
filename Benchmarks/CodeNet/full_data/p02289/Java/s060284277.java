import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Heap heap = new Heap();
        int i =0, k;
        String[] actions;
        String action= "";
        while(!(action= in.nextLine()).equals("end")){
            actions = action.split(" ");
            action = actions[0];
            if(action.equals("insert")){
                k = Integer.parseInt(actions[1]);
                heap.insert(k);
            }
            else{
                System.out.println(heap.extract());
            }
        }
    }
}
class Heap {
    private int[] heap;
    private int i;
    Heap(){
        this.heap = new int[2000001];
        this.i =1;
    }
    public void insert(int k){
        this.heap[this.i]=k;
        this.i++;
    }
    public int extract(){
        int answ;
        if(this.i==2){
            answ = this.heap[1];
        }
        else{
            heapfy();
            answ = this.heap[1];
            this.heap[1] = this.heap[(this.i-1)];
            this.heap[(this.i-1)] = answ;
        }
        this.i--;
        return answ;
    }
    private void heapfy(){
        int n = (this.i)-1, v, j, k;
        boolean heap=false;
        for(int i = n/2;i>=1;i--){
            v = this.heap[i];
            k = i;
            while (!heap && 2*k<=n){
                j = 2 *k;
                if(j<n && this.heap[j]<this.heap[j+1]){
                    j++;
                }
                if(this.heap[k]>=this.heap[j]){
                    heap = true;
                }
                else{
                    this.heap[k] = this.heap[j];
                    k = j;
                }
            }
            this.heap[k] = v;
        }
    }
}
