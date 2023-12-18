import java.util.*;

public class Main {
    Integer result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        String n3 = sc.nextLine();
        int num = sc.nextInt();
        int[] numbers = new int[num];
        for(int i=0; i<num; i++) {
            numbers[i] = sc.nextInt();
        }
        check(n1, n2, n3, numbers);
    }

    public static void check(String n1, String n2, String n3, int[] numbers) {
        int[] b1 = new int[3];
        int[] b2 = new int[3];
        int[] b3 = new int[3];
        String[] s1 = n1.split(" ");
        String[] s2 = n2.split(" ");
        String[] s3 = n3.split(" ");

        for(int i=0; i<3; i++) {
            b1[i] = Integer.parseInt(s1[i]);
            b2[i] = Integer.parseInt(s2[i]);
            b3[i] = Integer.parseInt(s3[i]);
        }
        List<String> checkList = new ArrayList<String>();
        for(int number: numbers) {
            for(int i=0; i<3; i++) {
                if(b1[i] == number) {
                    checkList.add("b1" + i);
                }
                if(b2[i] == number) {
                    checkList.add("b2" + i);
                }
                if(b3[i] == number) {
                    checkList.add("b3" + i);
                }
            }
        }
        if(checkList.contains("b10") && checkList.contains("b20") & checkList.contains("b30")
        || checkList.contains("b11") && checkList.contains("b21") & checkList.contains("b31")
                ||checkList.contains("b12") && checkList.contains("b22") & checkList.contains("b32")
            ||checkList.contains("b10") && checkList.contains("b11") & checkList.contains("b12")
        ||checkList.contains("b20") && checkList.contains("b21") & checkList.contains("b22")
        ||checkList.contains("b30") && checkList.contains("b31") & checkList.contains("b32")
            ||checkList.contains("b10") && checkList.contains("b21") & checkList.contains("b32")
            ||checkList.contains("b12") && checkList.contains("b21") & checkList.contains("b30")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
