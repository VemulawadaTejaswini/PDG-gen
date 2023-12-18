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
        Collections.sort(list);
        for(int i = 0;i < n-1;i++){
            if(list.get(i)==list.get(i+1)){
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println("YES");
    }
}