import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int input = scanner.nextInt();
            if(list.contains(input)){
                System.out.println("NO");
                return;
            }
            list.add(input);
        }
        scanner.close();
        System.out.println("YES");
    }

    
}