import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        List<Integer> list1 = new LinkedList<>();
        
        for(int i = 0; i < N; i++){
            list1.add(sc.nextInt());
        }
        
        boolean changeFlag = true;
        while(changeFlag){
            changeFlag = false;
            Collections.sort(list1);
            int min = list1.get(0);
            
            List<Integer> list2 = new LinkedList<>();   
            list2.add(min);
            for(int x : list1){
                if( x % min == 0) continue;
                if( x % min < min) changeFlag = true;
                list2.add(x % min);
            }

            list1 = list2;
        }
        
        Collections.sort(list1);
        
        System.out.println(list1.get(0));

    }
}
