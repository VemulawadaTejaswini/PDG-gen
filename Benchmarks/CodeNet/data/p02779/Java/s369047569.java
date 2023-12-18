import java.util.*;

public class Main {
    // AtCoder Beginner Contest 154
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        List<Integer> values = new ArrayList<>();
        for(int x = 0; x<N; x++){
            values.add(scanner.nextInt());
        }
        String returnVal = "YES";
        int[] index = new int[Math.max(N,Collections.max(values))+1];
        for(int x= 0; x<N; x++){
            index[values.get(x)]++;
            if(index[values.get(x)] > 1){
                returnVal = "NO";
                break;
            }
        }
        System.out.println(returnVal);

    }




}
