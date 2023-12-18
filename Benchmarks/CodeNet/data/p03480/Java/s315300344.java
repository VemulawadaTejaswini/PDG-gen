import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char c = s.charAt(0);
        int count = 1;
        int countSeg = 1;
        int max = 1;
        for(int i = 1; i < s.length(); i++){
            char currentC = s.charAt(i);
            if(c == currentC){
                count++;
            }else{
                if(count > max){
                    max = count;
                }
                count = countSeg;
                countSeg++;
                c = currentC;
            }
        }
        if(count > max){
            max = count;
        }
        System.out.println(max);
    }
}
