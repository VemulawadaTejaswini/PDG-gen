import java.util.*;
import java.lang.*;

class ArrayLib{
    static<E> E getOrDefault(E[] array, int index, E defaultValue){
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
    static<E extends Comparable<E>> E maxValueOfArray(E[] a){
        return a[maxIndexOfArray(a)];
    }
    static<E extends Comparable<E>> int minIndexOfArray(E[] a){
        int ans = 0;
        for(int i=1;i<a.length;i++){
            if(a[i].compareTo(a[ans])<0) ans=i;
        }
        return ans;
    }
    static<E extends Comparable<E>> E minValueOfArray(E[] a){
        return a[minIndexOfArray(a)];
    }

    // minimum x st. array[x] >= elm
    // assert: the array must be sorted before the function call
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
    // assert: the array must be sorted before the function call
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

        return true;
    }

    static void print(int[] array, String begin, String space, String end){
        StringBuilder sb = new StringBuilder();
        sb.append(begin);
        for(int i=0; i<array.length-1; i++){
            sb.append(array[i]);
            sb.append(space);
        }
        sb.append(array[array.length-1]);
        sb.append(end);
        System.out.print(sb);
    }
    static void print(int[] array){
        print(array, "", " ", "\n");
    }
    static void print(long[] array, String begin, String space, String end){
        StringBuilder sb = new StringBuilder();
        sb.append(begin);
        for(int i=0; i<array.length-1; i++){
            sb.append(array[i]);
            sb.append(space);
        }
        sb.append(array[array.length-1]);
        sb.append(end);
        System.out.print(sb);
    }
    static void print(long[] array){
        print(array, "", " ", "\n");
    }
    static void print(double[] array, String begin, String space, String end){
        StringBuilder sb = new StringBuilder();
        sb.append(begin);
        for(int i=0; i<array.length-1; i++){
            sb.append(array[i]);
            sb.append(space);
        }
        sb.append(array[array.length-1]);
        sb.append(end);
        System.out.print(sb);
    }
    static void print(double[] array){
        print(array, "", " ", "\n");
    }
    static void print(Object[] array, String begin, String space, String end){
        StringBuilder sb = new StringBuilder();
        sb.append(begin);
        for(int i=0; i<array.length-1; i++){
            sb.append(array[i]);
            sb.append(space);
        }
        sb.append(array[array.length-1]);
        sb.append(end);
        System.out.print(sb);
    }
    static void print(Object[] array){
        print(array, "", " ", "\n");
    }

}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Integer[] A = new Integer[N];
        for(int n=0; n<N; n++) A[n]=sc.nextInt();
        Arrays.sort(A);
        Integer[] B = new Integer[N];
        for(int n=0; n<N; n++) B[n]=sc.nextInt();
        Arrays.sort(B);
        Integer[] C = new Integer[N];
        for(int n=0; n<N; n++) C[n]=sc.nextInt();
        Arrays.sort(C);

        long ans = 0;
        for(int b:B) ans += ArrayLib.lowerBound(A, b)*(N-ArrayLib.upperBound(C,b));

        System.out.println(ans);
    }
}
