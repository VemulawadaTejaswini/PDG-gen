import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        int sn = s.length();
        int tn = t.length();
        int max = 0;
        int count = 0;
        for(int i = 0; i < sn-tn+1; i++){
            for(int j = 0; j < tn; j++){
                if(s.charAt(i+j) == t.charAt(j)){
                    count++;
                }
            }
            max = Math.max(max, count);
            count = 0;
        }
        System.out.println(tn-max);
    }
}