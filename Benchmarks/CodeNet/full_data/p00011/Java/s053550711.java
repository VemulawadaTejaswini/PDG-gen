import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) { 
        try (Scanner sc = new Scanner(System.in)) { 
            int w = sc.nextInt(); 
            int n = sc.nextInt(); 
            int[] values = new int[w]; 
            for (int i = 0; i < values.length; i++) { 
                values[i] = i + 1; 
            } 
            for (int i = 0; i < n; i++) { 
                String str = sc.next(); 
                String[] ab = str.split(","); 
                int a = Integer.parseInt(ab[0]) - 1; 
                int b = Integer.parseInt(ab[1]) - 1; 
                int c;
                c = values[a];
                values[a] = value[b];
                values[b] = c;
            } 
            for (int j = 0; j < n; j++){
                System.out.println("%d\n",values[i]);
            } 
        } 
    } 
}

