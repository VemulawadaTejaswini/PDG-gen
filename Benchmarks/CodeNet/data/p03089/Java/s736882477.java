import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < n; i++){
            list.add(Integer.parseInt(sc.next()));
        }
        
        int[] x = new int[n];
        for(int i = n-1; i >= 0; i--){
            for(int j = i; j >= 0; j--){
                if(list.get(j) == j+1){
                    x[i] = list.get(j);
                    list.remove(j);
                    break;
                }
                if(j == 0){
                    System.out.println("-1");
                    return;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(x[i]).append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}