import java.util.*;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Character,Integer> counters = new HashMap<>();
        HashMap<Character,Integer> indexes = new HashMap<>();
        boolean flag = false;
        String s;
        s = in.nextLine();
        int length = s.length();
        if(s.length() > 1 && (s.charAt(0) == s.charAt(1))){
            System.out.print(1);
            System.out.print(" ");
            System.out.print(2);
        }
        else if(s.length() == 2 || s.length() == 1){
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
        }
        else {
            for (int i = 0; i<s.length();i++){
                if(!counters.containsKey(s.charAt(i))){
                    counters.put(s.charAt(i),1);
                    indexes.put(s.charAt(i),i);
                }else{
                    counters.replace(s.charAt(i),counters.get(s.charAt(i)) + 1);
                    int count = counters.get(s.charAt(i));
                    int index = indexes.get(s.charAt(i));
                    double diff = (double) i- (double) index;
                    int differnece = (int) (Math.round(diff/2));
                    if(count > differnece){
                        System.out.print(index+1);
                        System.out.print(" ");
                        System.out.print(i+1);
                        flag = true;
                        break;
                    }
                    else {
                        if((i - index) > (length/2) ){
                            indexes.replace(s.charAt(i),i);
                            counters.replace(s.charAt(i),1);
                        }
                    }

                }
            }
            if(flag == false){
                System.out.print(-1);
                System.out.print(" ");
                System.out.print(-1);
            }
        }


    }
}
