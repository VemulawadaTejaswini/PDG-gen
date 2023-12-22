import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt(), queries = scan.nextInt();
        RangeMinQuery rmq = new RangeMinQuery(size);
        for(int i = 0; i < queries; i++){
            int c = scan.nextInt(); int x = scan.nextInt(); int y = scan.nextInt();
            if(c == 0) rmq.update(x, y);
            else System.out.println(rmq.rangemin(x, y));
        }
    }
}

class RangeMinQuery{
    int height;
    int tree[];
    RangeMinQuery(int size){
        for(height = 0; 1 << height < size; height++);
        tree = new int[1 << (height + 1)];
        for(int i = 0; i < tree.length; i++) tree[i] = (1 << 31) - 1;
        System.out.println("height: " + height);
    }

    private int sibling(int i){
        if(i == 0) throw new IllegalArgumentException("RangeMinQuery.sibling(0)");
        return ((i - 1) ^ 1) + 1;
    }

    void update(int i, int x){
        i += (1 << height) - 1;
        tree[i] = x;
        for(; i != 0; i = (i - 1) / 2){
            int min = Math.min(tree[i], tree[sibling(i)]);
            if(min == tree[(i - 1) / 2]) break;
            tree[(i - 1) / 2] = min;
        }
        //dump();
    }

    int rangemin(int from, int to){
        if(!(0 <= from && from <= to && to < (1 << height)))
            throw new IllegalArgumentException("from < to");
        int depth = height, size = (to - from) + 1;
        from += (1 << height) - 1;
        int r = tree[from];
        while(0 < size){
            for(; from % 2 == 1 && 2 << (height - depth) <= size; depth--, from /= 2);
            for(; size < 1 << (height - depth); depth++, from = from * 2 + 1);
            r = Math.min(r, tree[from]);
            from++;
            size -= 1 << (height - depth);
        }
        return r;
    }

    void dump(){
        int subarr[];
        for(int i = 0; i <= height; i++){
            subarr = Arrays.copyOfRange(tree, (1 << i) - 1, (1 << i + 1) - 1);
            System.out.println(Arrays.toString(subarr));
        }
    }
}