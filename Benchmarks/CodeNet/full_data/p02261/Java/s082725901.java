import java.util.*;
//安定したソート
public class  Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        String a[] = new String[N];
        String b[] = new String[N]; 
        for(int i = 0; i < N; i++){
            a[i] = sc.next();
            b[i] = a[i];
        }
        BubbleSort(a);
        System.out.println("Stable");
        SelectionSort(b);
        System.out.println(Stable(a, b)? "Stable": "Not stable");
    }
    

    static void BubbleSort(String[] a){
        for (int i = 0; i <  a.length- 1; i++) {
            // 繰り返し最後から比べる
            for (int j = a.length - 1; j > i; j--) {
                if (a[j-1].charAt(1) > a[j].charAt(1)) {     
                    String tmp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a) .replaceAll("[\\[\\],]", ""));
        // replaceAll() 、「文字列を正規表現で置換」対象の文字列.replaceAll("[正規表現]", "置換する文字列")
        // \ 　→　\\\  ,　*  →  \\*　, {} →  \\{\\} , [], → \\[\\],
    }
    


    static void SelectionSort(String[] b){
        for (int i = 0; i <  b.length - 1; i++) {
            int mini = i; 
            //最小値探す
            for (int j = i + 1; j < b.length; j++) {
                if (b[mini].charAt(1) > b[j].charAt(1)) {     
                    //miniに最小値の場所入れて置く
                   mini = j;
                }
            }    
            //最小値の場所が入れ替わっているとき
            if(mini != i){
                String e = b[mini];
                b[mini] = b[i];
                b[i] = e;
            }
        }
    System.out.println(Arrays.toString(b) .replaceAll("[\\[\\],]", ""));
    // replaceAll() 、「文字列を正規表現で置換」対象の文字列.replaceAll("[正規表現]", "置換する文字列")
    // \ 　→　\\\  ,　*  →  \\*　, {} →  \\{\\} , [], → \\[\\],
    }

    static boolean Stable(String[] a, String[] b){
        for(int i = 0; i < a.length; i++){
            if(!a[i].equals(b[i]))return false;
        }
        return true;
    }
    
}


