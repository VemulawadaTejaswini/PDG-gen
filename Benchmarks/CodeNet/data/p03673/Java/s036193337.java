import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < n+1; i++){
            if(i % 2 == 0){
                list.add(0,sc.nextInt());
            }else {
                list.add(sc.nextInt());
            }
        }
        if(n % 2 == 1) Collections.reverse(list);
        for(int i = 0; i < n; i++){
            if(i == n-1){
                System.out.println(list.get(i));
            }else {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}