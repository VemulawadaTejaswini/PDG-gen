import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        array1 arr = new array1();
        do {
            String[] frase = in.nextLine().split(" ");
            if (frase[0].equals("insert")) {
                arr.insert(Integer.parseInt(frase[1]));
            } else if (frase[0].equals("extract")) {
                arr.extract();
            } else {
                break;
            }
        } while (true);
    }
}

class array1 {
    ArrayList<Integer> heapArray;
    protected int curr = 0;

    public array1() {
        heapArray = new ArrayList<Integer>();
    }

    public void insert(int key) {
        curr = heapArray.size() - 1;
        if (heapArray.size() == 0) {
            heapArray.add(key);
        } else {
            heapArray.add(key);
            heapify(heapArray.size() - 1);
        }
    }

    public void extract(){
        int aux = heapArray.get(0);
        heapArray.set(0, heapArray.get(heapArray.size()-1));
        heapArray.remove(heapArray.size() - 1);
        if(heapArray.size() != 0) {
            heapifyCorrectAll(heapArray.size() - 1);
        }
        System.out.println(aux);
    }

    public void swap(int curr, int changeTo){
        int aux = heapArray.get(curr);
        heapArray.set(curr, heapArray.get(changeTo));
        heapArray.set(changeTo, aux);
    }

    public void heapify(int curr) {
        int father;
        if (curr != 0 && curr % 2 == 0) {
            father = (curr - 2) / 2;
        } else if(curr % 2 == 1) {
            father = (curr - 1) / 2;
        } else{
            return;
        }

        if (heapArray.get(father) < heapArray.get(curr)) {
            swap(curr, father);
            curr = father;
            heapify(curr);
        }else{
            return;
        }
    }

    void heapifyCorrectAll(int curr) {
        int largest = curr;
        int l = 2 * curr + 1;
        int r = 2 * curr + 2;

        if (l < heapArray.size() && heapArray.get(l) > heapArray.get(largest)) {
            largest = l;
        }
        if (r < heapArray.size() && heapArray.get(r) > heapArray.get(largest)) {
            largest = r;
        }

        if (largest != curr) {
            swap(curr, largest);
            heapifyCorrectAll(largest);
        }
    }
}
