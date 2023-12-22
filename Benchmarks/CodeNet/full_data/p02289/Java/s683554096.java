import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String input = "hooray!";
        HeapQ prior = new HeapQ();

        while(!(input.equals("end"))){
            input = in.next();

            if(input.startsWith("i")){
                input = in.next();
                prior.givePriority(Integer.parseInt(input));
                prior.heapifyTD();
            }

            else if(input.equals("extract")){
                System.out.printf("%d\n",prior.extract());
                prior.heapifyBU();
            }

        }
        in.close();

    }
}

class HeapQ {

    private int[] queue;
    private int size;


    HeapQ() {
        this.queue = new int[2000001];
        this.size = 0;
    }

    public void givePriority(int toIns){
        this.queue[size + 1] = toIns;
        this.size++;
    }

    public void heapifyBU() {
        for (int  i = this.size/2; i >= 1; i--) {
            int k = i;
            int v = this.queue[k];
            boolean heap = false;

            while (!heap && ( (2 * k) <= this.size) ) {
                int j = 2 * k;

                if(j < this.size){
                    if(queue[j] < queue[j + 1]){
                        j = j + 1;
                    }
                }
                if(v >= queue[j]){
                    heap = true;
                }
                else{
                    queue[k] = queue[j];
                    k = j;
                }
            }
            queue[k] = v;

        }


    }

    void heapifyTD() {
        for(int i = this.size; i > 1; i /=2){
            int father = queue[i/2];

            if(queue[i] > father ){
                int aux = father;
                queue[i/2] = queue[i];
                queue[i] = aux;
            }
            else{
                break;
            }
        }
    }

    public int extract(){
        int something = this.queue[1];
        queue[1] = queue[this.size];
        this.size--;
        heapifyBU();

        return something;
    }
}
