import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertexes = sc.nextInt();
        int numOfOperation = sc.nextInt();
        BST tree = new BST(vertexes);
        for(int i=1;i<vertexes;i++){
            tree.setPointer(sc.nextInt(),sc.nextInt());
        }
        for(int i=0;i<numOfOperation;i++){
            tree.addPoint(sc.nextInt(),sc.nextInt());
        }
        tree.printEachCounter();
    }
}

class BSTE {
    private int left = 0;
    private int right = 0;
    private int counter = 0;

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public int getCounter() {
        return counter;
    }

    public void addCounter(int i){
        counter += i;
    }

    public void setPointer(int vertex){
        if(vertex<=0){
            throw new IllegalArgumentException();
        }
        if(left==0){
            this.left = vertex;
        }else if(right==0){
            this.right = vertex;
        }
    }

    public BSTE(){
        //nothing to do.
    }

}

class BST{
    private BSTE[] tree;
    private static final int ROOT_IDX = 1;

    public BST(int size){
        tree = new BSTE[size+1];
        for(int i=1;i<=size;i++) { //0番は使わない
            tree[i] = new BSTE();
        }
    }

    public void setPointer(int from, int to){
        tree[from].setPointer(to);
    }

    public void addPoint(int vertex, int point){
        addPoint(ROOT_IDX, vertex, point, false);
    }

    private void addPoint(int currentIdx, int vertex, int point, boolean addition){
        if(currentIdx!=0) {
            if (!addition){
                addition = currentIdx == vertex;
            }
            if (addition) {
                tree[currentIdx].addCounter(point);
            }
            addPoint(tree[currentIdx].getLeft(), vertex, point, addition); //左を全部見る
            addPoint(tree[currentIdx].getRight(), vertex, point, addition); //右を全部見る
        }
    }

    public void printEachCounter(){
        for(int i=1;i<tree.length;i++){
            System.out.print(tree[i].getCounter());
            if(i==tree.length-1) break;
            System.out.print(" ");
        }
    }
}