import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            int num = sc.nextInt();
            list.add(num);
        }
        int check = list.size();
        list.stream().distinct();
        int check2 = list.size();
        
        System.out.println(check == check2?"YES":"NO");
    }
}