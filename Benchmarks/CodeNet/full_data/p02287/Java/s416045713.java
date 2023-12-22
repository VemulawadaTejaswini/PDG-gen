import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int[] a = new int[h+1];
        for(int i = 1; i <= h; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= h; i++){
            sb.append("node ").append(i);
            sb.append(": key = ").append(a[i]).append(", ");
            if(i >= 2){
                sb.append("parent key = ").append(a[i/2]).append(", ");
            }
            if(i*2 <= h){
                sb.append("left key = ").append(a[i*2]).append(", ");
            }
            if(i*2+1 <= h){
                sb.append("right key = ").append(a[i*2+1]).append(", ");
            }
            sb.append(System.lineSeparator());
        }
        
        System.out.print(sb);
    }
}
