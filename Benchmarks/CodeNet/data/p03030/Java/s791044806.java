/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Triplet<String, Integer, Integer>[] tri = new Triplet[n];
        for (int i = 0; i < n; i++) {
            tri[i] = new Triplet<>(sc.next(),sc.nextInt(),i+1);
        }
        Comparator<Triplet<String, Integer, Integer>> cmpx =  Comparator.comparing(v->v.x);
        Comparator<Triplet<String, Integer, Integer>> cmpy =  Comparator.comparing(v->v.y);
        Arrays.sort(tri, cmpx.thenComparing(cmpy.reversed()));

        for (int i = 0; i < n; i++) {
            System.out.println(tri[i].z);
        }

        sc.close();
    }        
    

    /**
     * Pair_int
     */
    public static class Pair<T1,T2>{
        public T1 x;
        public T2 y;

        public Pair(T1 x, T2 y){
            this.x = x;
            this.y = y;
        }
        
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static class Triplet<T1,T2,T3>{
        public T1 x;
        public T2 y;
        public T3 z;

        public Triplet(T1 x, T2 y, T3 z){
            this.x = x;
            this.y = y;
            this.z = z;
        }
        
        public String toString() {
            return "(" + x + ", " + y + "," + z + ")";
        }
    }
}



