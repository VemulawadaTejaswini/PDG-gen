import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyPriorityQueue<Integer> queue = new MyPriorityQueue<>();
        while (true){
            String order = input.next();
            if(order.equals("end")){
                break;
            }else {
                if(order.equals("insert")){
                    int num = input.nextInt();
                   queue.enqueue(num);
                }else {
                    System.out.println(queue.dequeue());
                }
            }
        }
    }
}

class Heap<E extends Comparable<E>> {
    private ArrayList<E> list = new ArrayList<>();

    Heap() {
    }


    void add(E newObject){
        list.add(newObject);  //添加到堆中
        int currentIndex = list.size() - 1;  //获得最后一个节点的下标

        while (currentIndex > 0){
            int parentIndex = (currentIndex - 1) / 2;
            //如果当前节点大于父节点，交换
            if(list.get(currentIndex).compareTo(list.get(parentIndex)) > 0){
                E temp = list.get(currentIndex);
                list.set(currentIndex,list.get(parentIndex));
                list.set(parentIndex,temp);
            }else {
                break;  //二叉堆建立了成功
            }

            currentIndex = parentIndex;
        }
    }

    E remove(){
        if(list.size() == 0){
            return null;
        }

        E removeObject = list.get(0);
        list.set(0,list.get(list.size() - 1));
        list.remove(list.size() - 1);

        int currentIndex = 0;
        while (currentIndex < list.size()){
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;
            //Find the maximum between two children
            if(leftChildIndex >= list.size()){
                break;
            }
            int maxIndex = leftChildIndex;
            if(rightChildIndex < list.size()){
                if(list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0){
                    maxIndex = rightChildIndex;
                }
            }

            //如果现在的节点小于，交换
            if(list.get(currentIndex).compareTo(list.get(maxIndex)) < 0){
                E temp = list.get(maxIndex);
                list.set(maxIndex,list.get(currentIndex));
                list.set(currentIndex,temp);
                currentIndex = maxIndex;
            }else {
                break;
            }
        }

        return removeObject;
    }

//    int getSize(){
//        return list.size();
//    }
}

class MyPriorityQueue<E extends Comparable<E>>{
    private Heap<E> heap = new Heap<>();

    void enqueue(E newObject){
        heap.add(newObject);
    }

    E dequeue(){
        return heap.remove();
    }

//    public int getSize(){
//        return heap.getSize();
//    }
}

