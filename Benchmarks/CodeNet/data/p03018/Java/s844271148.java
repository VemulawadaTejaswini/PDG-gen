import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String line = sc.nextLine();
        StringBuilder line = new StringBuilder(sc.nextLine());
        int count1 = 0;
        int count = 0;
        do{
            count = 0;
            int i;
            for(i = 0; i < line.length() - 2; i++){
                if(line.substring(i, i + 3).equals("ABC")){
                    line.replace(i, i + 3, "BCA");
                    count++;
                }
            }
            count1 += count;
        }while(count > 0);
        System.out.println(count1);
    }
}