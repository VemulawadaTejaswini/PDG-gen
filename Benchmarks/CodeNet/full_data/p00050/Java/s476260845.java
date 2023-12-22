import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String str1 = str.replaceAll("apple","りんご");
        String str2 = str1.replaceAll("peach","apple");
        String str3 = str2.replaceAll("りんご","peach");

        System.out.println(str3);
    }
}
