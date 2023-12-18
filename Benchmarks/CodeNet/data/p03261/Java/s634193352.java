import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int main_1 = scanner.nextInt();
        String[] main_2 = new String[main_1];
        for(int main_3 = 0;main_3 < main_1;main_3++){
            String main_5 = scanner.next();
            main_2[main_3] = main_5;
        }
        for(String main_6:main_2){
            for(String main_7:main_2){
                if(main_6.equalsIgnoreCase(main_7)){
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        for(int main_8 = 0;main_8 < main_1;main_8++){
            if(main_8 != 0){
                String main_9 = main_2[main_8];
                String main_10 = main_2[main_8 - 1];
                if(!main_9.substring(main_9.length() - 1).equalsIgnoreCase(main_10.substring(0, 1))){
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        System.out.println("Yes");
    }
}