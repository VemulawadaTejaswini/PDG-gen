import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;




//D
public class Main {

    static int N;
    static int Q;
    static IntList[] v;
    static int[] ans;
    static int[] parent;
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);

        N=sc.nextInt();
        Q=sc.nextInt();
        v=new IntList[N+1];
        ans=new int[N+1];
        parent=new int[N+1];
        for(int i=1;i<=N;i++) {
            v[i]=new IntList();
        }
        for(int i=1;i<=N-1;i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            v[a].add(b);
            parent[b]=a;

        }

        for(int i=0;i<Q;i++) {
            int p=sc.nextInt();
            int q=sc.nextInt();
            ans[p]+=q;
        }


        for(int i=2;i<=N;i++) {

            int pi=parent[i];
            // System.err.println("i pi "+i+" "+pi);

            if(pi!=0) {ans[i]+=ans[pi];}

        }

        for(int i=1;i<=N;i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}

class IntList{
    private int[] array;
    private int size = 0;
    public IntList() {
        array = new int[256];
    }

    public IntList(int size) {
        array = new int[size];
    }

    public void add(int a) {
        if(size == array.length) {
            int newSize = Math.min(Integer.MAX_VALUE, size*2);
            array = Arrays.copyOf(array, newSize);
        }
        array[size++] = a;
    }

    public void addAll(IntList list) {
        for (int i = 0; i < list.size(); i++) {
            this.add(list.get(i));
        }
        // TODO convert to copyOf
//        int[] a = list.getArray();
//        int numNew = a.length;
//        if(size + numNew > array.length) {
//            int length = array.length;
//            while (size + numNew < length) {
//                length *= 2;
//            }
//            array = Arrays.copyOf(array, length);
//        }
//        System.arraycopy(a, 0, array, size, numNew);
//        size += numNew;
    }

    public int get(int i) {
        if(i >= size) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%d, i=%d", i, size));
        }
        return array[i];
    }

    public int size(){
        return size;
    }

    public int[] getArray() {
        return array;
    }
}