import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(a[i]);
            Collections.reverse(list);
        }
        for(int i = 0; i < n; i++){
            if(i == n-1){
                System.out.println(list.get(i));
            }else {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}