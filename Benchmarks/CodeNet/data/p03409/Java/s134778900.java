import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<int[]> redList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int nums[] = {x + y, x, y};
            redList.add(nums);
        }

        List<int[]> blueList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int nums[] = {x + y, x, y};
            blueList.add(nums);
        }

        redList.sort((o1, o2) -> (o2[0]) - (o1[0]));
        blueList.sort((o1, o2) -> (o2[0]) - (o1[0]));

        int p = 0;
        int score = 0;
        for (int[] blues: blueList){
            while(true){
                if(p >= redList.size()){
                    break;
                }
                int[] reds = redList.get(p);
                System.out.println("b" + blues[0] + "r" + reds[0]);

                if(blues[0] >= reds[0]){
                    System.out.println("b" + blues[1] + "b" + blues[2] + "r" + reds[1] + "r" + reds[2]);
                    if(blues[1] > reds[1] && blues[2] > reds[2]){
                        score++;
                        System.out.println("p");
                        redList.remove(p);
                        p = 0;
                        break;
                    }
                }
                p++;
            }
        }
        System.out.println(score);
    }
}

//    List<int[]> blueList = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//        int nums[] = {sc.nextInt(), sc.nextInt()};
//        blueList.add(nums);
//        }
//
//        for (int[] nums : redList){
//        System.out.println(nums[0] + "," + nums[1]);
//        }
//        System.out.println("\n");
//
//        redList.sort(Comparator.comparingInt(o -> o[0]));
//        redList.sort(Comparator.comparingInt(o -> o[1]));
//
//        for (int[] nums : redList){
//        System.out.println(nums[0] + "," + nums[1]);
//        }
