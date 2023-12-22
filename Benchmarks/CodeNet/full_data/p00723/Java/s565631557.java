import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Reopard on 2014/06/05.
 */
public class Main{
    static Scanner sc = new Scanner(System.in);
    static HashSet<String> set = new HashSet<String>();

    public static void main(String[] args){
        int n, p;
        String line;
        char[] train, forward, back;
        n = sc.nextInt();
        while(n > 0){
            set.clear();
            line = sc.next();
            train = line.toCharArray();
            for(int i = 1; i < train.length; i++){
                forward = new char[i];
                back = new char[train.length - i];
                for(p = 0; p < i; p++) forward[p] = train[p];
                for(; p < train.length; p++) back[p - i] = train[p];
                addTrainPair(forward, back);
                addTrainPair(back, forward);
            }
            System.out.println(set.size());
            n--;
        }

    }

    static void addTrainPair(char[] f, char[] b){
        int i, p;
        char[] tmp = new char[f.length + b.length], f_reverse = reversalLine(f), b_reverse = reversalLine(b);
        for(p = 0; p < f.length; p++) tmp[p] = f[p];
        for(i = p; i < b.length + p; i++) tmp[i] = b[i - p];
        set.add(new String(tmp));
        for(p = 0; p < f.length; p++) tmp[p] = f_reverse[p];
        for(i = p; i < b.length + p; i++) tmp[i] = b[i - p];
        set.add(new String(tmp));
        for(p = 0; p < f.length; p++) tmp[p] = f[p];
        for(i = p; i < b.length + p; i++) tmp[i] = b_reverse[i - p];
        set.add(new String(tmp));
        for(p = 0; p < f.length; p++) tmp[p] = f_reverse[p];
        for(i = p; i < b.length + p; i++) tmp[i] = b_reverse[i - p];
        set.add(new String(tmp));
    }

    static char[] reversalLine(char[] a){
        char[] tmp = new char[a.length];
        for(int i = 0; i < a.length; i++) tmp[i] = a[a.length - i - 1];
        return tmp;
    }
}