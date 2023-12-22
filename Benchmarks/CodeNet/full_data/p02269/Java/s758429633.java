import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;


class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        Set<String> set = new HashSet<>();

        for(int i = 0; i <= num; i++){

            if(i == num) break;

            String str = scn.next();
            String str2 = scn.next();

            if(str.equals("insert")) set.add(str2);
            else if(str.equals("find")){
                if(set.contains(str2)) System.out.println("yes");
                else System.out.println("no");
            }
        }
    }
}
