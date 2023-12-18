import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        int l = sc.nectInt();
      
        String[] list = new String[n];

        for (int i = 0; i < n; i++) {
          list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        String answer = "";
        for(int i = 0; i < n; i++) {
          answer +=list[i];
        }      
       
            System.out.println(answer);
    }
}
