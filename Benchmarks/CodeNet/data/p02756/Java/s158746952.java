import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int q = sc.nextInt();
        for(int i = 0;i < q;i++){
            if(sc.nextInt() == 1){
                char[] s2 = s.toCharArray();
                for(int j = 0;j < (s2.length / 2);j++){
                    char temp = s2[j];
                    s2[j] = s2[s2.length - 1 - j];
                    s2[s2.length - 1 - j] = temp;
                }
                s = "";
                for(int j = 0;j < s2.length;j++) s += String.valueOf(s2[j]);
            }else{
                if(sc.nextInt() == 1){
                    s = sc.next() + s;
                }else{
                    s = s + sc.next();
                }
            }
        }
        System.out.println(s);
    }
}
