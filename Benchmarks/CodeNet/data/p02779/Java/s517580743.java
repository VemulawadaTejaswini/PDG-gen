import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        boolean judge = true;
        
        for(int i=0; i<N; i++){
            int tmp =sc.nextInt();
            if(list.contains(tmp)){
                judge = false;
                break;
            }else{
                list.add(tmp);
            }
        }
        
        if(judge) System.out.println("YES");
        else System.out.println("NO");
        
    }
}
