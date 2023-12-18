import java.util.*;
import java.lang.*;

class Pair<E extends Comparable<E>,F extends Comparable<F>> implements Comparable<Pair<E,F>>{
    E first;
    F second;
    public Pair(E first, F second){
        this.first=first;
        this.second=second;
    }
    public E getFirst(){return first;}
    public F getSecond(){return second;}
    public String toString(){
        return "<"+first.toString()+","+second.toString()+">";
    }
    public int hashCode(){
        return first.hashCode()*30011+second.hashCode()+2;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair another = (Pair) obj;
        return this.getFirst().equals(another.getFirst())&&this.getSecond().equals(another.getSecond());
    }

    public int compareTo(Pair<E,F> another){
        if(this.getFirst().equals(another.getFirst())){
            return this.getSecond().compareTo(another.getSecond());
        }
        return this.getFirst().compareTo(another.getFirst());
    }

}
class ArrayLib{
    static<E extends Comparable<E>> E getOrDefault(E[] array, int index, E defaultValue){
        if(index<0 || index>=array.length) return defaultValue;
        return array[index];
    }

    static<E extends Comparable<E>> int maxIndexOfArray(E[] a){
        int ans = 0;
        for(int i=1;i<a.length;i++){
            if(a[i].compareTo(a[ans])>0) ans=i;
        }
        return ans;
    }
    static<E extends Comparable<E>> int minIndexOfArray(E[] a){
        int ans = 0;
        for(int i=1;i<a.length;i++){
            if(a[i].compareTo(a[ans])<0) ans=i;
        }
        return ans;
    }

    // minimum x st. array[x] >= elm
    static<E extends Comparable<E>> int lowerBound(E[] array, E elm){
        if(array[0].compareTo(elm)>=0) return 0;
        int min = 0, max = array.length;
        // array[min] < elm
        // array[max] >= elm
        while(min+1<max){
            int mid = (min+max)/2;
            if(array[mid].compareTo(elm) < 0) min = mid;
            else max = mid;
        }
        return max;
    }
    // minimum x st. array[x] > elm
    static<E extends Comparable<E>> int upperBound(E[] array, E elm){
        if(array[0].compareTo(elm)>0) return 0;
        int min = 0, max = array.length;
        // array[min] <= elm
        // array[max] > elm
        while(min+1<max){
            int mid = (min+max)/2;
            if(array[mid].compareTo(elm) <= 0) min = mid;
            else max = mid;
        }
        return max;
    }
    static<E extends Comparable<E>> int count(E[] array, E elm){
        return upperBound(array,elm)-lowerBound(array,elm);
    }

    static boolean nextPermutation(List<Integer> list){
        int pivotPos = -1;
        int pivot = 0;
        for (int i=list.size()-2; i>=0; i--) {
            if (list.get(i) < list.get(i+1)) {
                pivotPos = i;
                pivot = list.get(i);
                break;
            }
        }

        if (pivotPos==-1 && pivot==0) return false;

        int L = pivotPos+1, R = list.size()-1;
        int minPos = -1;
        int min = Integer.MAX_VALUE;
        for (int i=R; i>=L; i--) {
            if (pivot < list.get(i)) {
                if (list.get(i) < min) {
                    min = list.get(i);
                    minPos = i;
                }
            }
        }

        Collections.swap(list, pivotPos, minPos);
        Collections.sort(list.subList(L, R+1));

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<list.size(); i++) sb.append(list.get(i));

        return true;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        Long[] V = new Long[N];
        for(int n=0; n<N; n++) V[n]=sc.nextLong();
        Arrays.sort(V);

        double sum = 0;
        for(int a=0; a<A; a++) sum += V[N-1-a];
        System.out.printf("%.10f\n",sum/A);

        long lastItemValue = V[N-A];

        int lastItemMin, lastItemMax;

        lastItemMin = A - (N-ArrayLib.upperBound(V, lastItemValue));
        if(V[N-1]==lastItemValue) lastItemMax = Math.min(B, ArrayLib.count(V, lastItemValue));
        else lastItemMax = lastItemMin;


        long[][] combination = new long[100][100];
        combination[1][0]=1; combination[1][1]=1;
        for(int n=2; n<100; n++) for(int r=0; r<=n; r++) combination[n][r]=combination[n-1][r]+(r<=0?0:combination[n-1][r-1]);


        long ans = 0;

        for(int lastItem = lastItemMin; lastItem<=lastItemMax; lastItem++){
            ans += combination[ArrayLib.count(V,lastItemValue)][lastItem];
        }
        System.out.println(ans);
    }
}
