import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0 ; i < n ; i++ ){
            s[i] = sc.next();
        }
        String[] ko = new String[n];
        ko[0] = s[0];
        int num = 1;
        for(int i = 1 ; i < n ; i++ ){
            int stat = 0;
            for(int j = 0 ; j < num && stat == 0 ; j++ ){
                if(ko[j].equals(s[i])){
                    stat = 1;
                }
                if(stat == 0 && j == num - 1){
                    ko[num] = s[i];
                    num++;
                }
            }
        }
        System.out.println(num);
        sc.close();
    }
}