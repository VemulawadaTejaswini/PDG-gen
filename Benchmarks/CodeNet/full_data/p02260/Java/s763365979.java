import java.util.*;
 
public class  Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int a[] = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        SelectionSort(a);
    }
    

    static void SelectionSort(int[] a){
    int count = 0;
    for (int i = 0; i <  a.length - 1; i++) {
        int mini = i; 
        //最小値探す
        for (int j = i + 1; j < a.length; j++) {
            if (a[mini] > a[j]) {     
                //miniに最小値の場所入れて置く
                mini = j;
            }
        }    
        //最小値の場所が入れ替わっているとき
        if(mini != i){
            int e = a[mini];
            a[mini] = a[i];
            a[i] = e;
            count++;
        }
        

          
            
        
    }
    System.out.println(Arrays.toString(a) .replaceAll("[\\[\\],]", ""));
    // replaceAll() 、「文字列を正規表現で置換」対象の文字列.replaceAll("[正規表現]", "置換する文字列")
    // \ 　→　\\\  ,　*  →  \\*　, {} →  \\{\\} , [], → \\[\\],
        System.out.println(count);
}
    
}


