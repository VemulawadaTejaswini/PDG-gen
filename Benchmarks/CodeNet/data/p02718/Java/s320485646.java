import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[2];
        for(int i = 0;i < arr.length;i++) {
            arr[i] = scanner.nextLine();
        }

        String[] strmaster = arr[0].split(" ");

        Integer[] nm = new Integer[2]; 
        for (int i = 0; i < strmaster.length; i++) {
            nm[i] = Integer.parseInt(strmaster[i]);
        }

        int n = nm[0];
        int m = nm[1];

        strmaster = arr[1].split(" ");
        List<Integer> listA = new ArrayList<>(); 
        for (int i = 0; i < strmaster.length; i++) {
            listA.add(Integer.parseInt(strmaster[i]));
        }
        
        Collections.sort(listA, Collections.reverseOrder());

        int totalVotes = 0;
        for (Integer integer : listA) {
            totalVotes = totalVotes + integer;
        }

        boolean flag = true;
        for (int i = 0; i < m; i++) {
            if (listA.get(i) < ((totalVotes + (4 * m) - 1) / (4 * m))) {
                flag = false;
            }
        }
        
        if (flag) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        scanner.close();
    }
}