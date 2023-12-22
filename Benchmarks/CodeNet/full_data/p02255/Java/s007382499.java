import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int [n];
        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        process(numbers, n, sb);
        
        for(int i = 1; i < n; i++){
            int v = numbers[i];
            int j = i - 1;
            while(j >= 0 && numbers[j] > v){
                numbers[j + 1] = numbers[j];
                j--;
                
            }
            numbers[j + 1] = v;
            process(numbers, n, sb);
        }
        System.out.print(new String(sb));
    }
    
    private static void process(int numbers[], int n, StringBuilder sb){
        for(int i = 0; i < n; i++){
            if(i != 0){
                sb.append(" ");
            }
            sb.append(numbers[i]);
        }
        sb.append("\n");
    }
}
