import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int ans = 0;
        for(int i = 0;i < n;i++){
            list.add(sc.nextInt());
        }
        for(int i = 1;i < n;i++){
            boolean ok = true;
            for(int j = 0;j < i;j++){
                if(list.get(i) > list.get(j)){
                    ok = false;
                    break;
                }
            }
            if(ok)
                ans++;
        }
        System.out.println(ans);
    }
}