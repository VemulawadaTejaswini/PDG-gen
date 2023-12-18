import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] s = S.split("");
        int count = 1;
        int idx = 1;
        for(int i = 1; i < 4; i++) {
            if(s[0].equals(s[i])) {
                count++;
                idx = i;
            }
        }
        
        if(count != 2) {
            System.out.println("No");
        }else {
            count = 1;
            for(int i = 1; i < 3; i++) {
                if(i == idx) {
                    continue;
                }
                for(int j = i+1; j < 4; j++) {
                    if(j == idx) {
                        continue;
                    }
                    if(s[i].equals(s[j])) {
                        System.out.println("Yes");
                    }
                }
                
            }
        }
        
    }
}