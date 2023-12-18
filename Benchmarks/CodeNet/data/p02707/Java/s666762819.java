import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<n; i++){
            list.add(scanner.nextInt());
        }
        scanner.close();
        List<Integer> result = new ArrayList<>();
        for(int i=1; i<=n; i++){
            int sum = 0;
            for (int val : list) {
                if(i == val){
                    sum += 1;
                }
            }
            result.add(sum);
        }
        for (int val : result) {
            System.out.println(val);
        }
    }

}