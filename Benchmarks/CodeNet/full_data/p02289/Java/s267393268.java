import javax.sound.midi.SysexMessage;
import java.util.Scanner;

class Heap {
    int array[];
    int s;
    int n;

    public Heap (){
        this.array = new int [50];
        this.s = 50;
        this.n = 0;
    }

    void push (int val){
        if (n == s){
            increase();
        }
        this.array[n] = val;
        bubbleup();
        n++;
    }

    int pop (){
        if (n > 0) {
            int resp = array[0];
            array[0] = array[n - 1];
            heapify(0);
            n--;
            return resp;
        }
        return 0;
    }

    void increase (){
        this.s *= 2;
        int temp[] = new int[s];
        for (int i = 0; i < n; i++){
            temp[i] = this.array[i];
        }
        this.array = temp;
    }

    void bubbleup (){
        int x = n;
        boolean finish = false;
        while (x > 0 && !finish){
            int y = (x - 1) / 2;
            if (array[x] > array[y]){
                int temp = array[x];
                array[x] = array[y];
                array[y] = temp;
            }else {
                finish = true;
            }
            x = y;
        }
    }

    void heapify(int i){
        int l = (2 * i) + 1;
        int r = (2 * i) + 2;
        int m = i;
        if (l < n && array[m] < array[l]){
            m = l;
        }
        if (r < n && array[m] < array[r]){
            m = r;
        }
        if (m != i){
            int temp = array[i];
            array[i] = array[m];
            array[m] = temp;
            heapify(m);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cmd = in.next();

        Heap josh = new Heap ();

        while (!cmd.equals("end")){
            if (cmd.equals("insert")){
                int val = in.nextInt();
                josh.push(val);
            }else {
                int resp = josh.pop();
                System.out.println(resp);
            }
            cmd = in.next();
        }
    }
}
