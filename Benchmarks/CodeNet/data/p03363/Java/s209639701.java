import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        arr[0] = 0;
        arr[1] = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(arr[0], 1);
        for(int i=2;i<1+n;i++){
            arr[i] = arr[i-1] + sc.nextInt();
        }
        for(int i=1;i<n+1;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else map.put(arr[i], 1);
        }
        long ans =0L;
        for(Map.Entry<Integer, Integer> mape: map.entrySet()){
            if(mape.getValue()>0){
                ans+= (mape.getValue())* (mape.getValue()-1) / 2;
            }
        }
        System.out.println(ans); return;
    }
}
