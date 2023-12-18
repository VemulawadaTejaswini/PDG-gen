import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        List<String> s = new ArrayList<>();
        for(int i = 0; i < N; i++)
            list.add(sc.nextInt());
        sc.close();
        for(int i = 0; i < N; i++){
            for(int j = list.size()-1; j>=0; j--){
                if(list.get(j) == j+1){
                    s.add(Integer.toString(j+1));
                    list.remove(j);
                    break;
                }
            }
        }
        if(list.size() != 0){
            System.out.println(-1);
        } else {
            for(int i = N-1; i >= 0; i--){
                System.out.println(s.get(i));
            }
        }
    }
}